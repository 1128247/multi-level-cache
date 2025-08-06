package com.main.level3cache.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.main.level3cache.service.CacheStatisticsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.cache.support.CompositeCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableCaching
public class CacheConfiguration {

    /**
     * L1 Caffeine 缓存的原始管理器
     */
    @Bean("caffeineCacheManager")
    public CacheManager caffeineCacheManager() {
        CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager();
        caffeineCacheManager.setCaffeine(Caffeine.newBuilder()
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .maximumSize(1000));
        return caffeineCacheManager;
    }

    /**
     * L2 Redis 缓存的原始管理器
     */
    @Bean("redisCacheManager")
    public CacheManager redisCacheManager(RedisConnectionFactory connectionFactory) {
        RedisCacheConfiguration redisConfig = RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofHours(1))
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));

        return RedisCacheManager.builder(connectionFactory)
                .cacheDefaults(redisConfig)
                .build();
    }

    /**
     * L1 Caffeine 缓存的日志装饰器版本
     * 这个 Bean 可以被手动指定使用
     */
    @Bean("caffeineCacheManagerWithLogs")
    public CacheManager decoratingCaffeineManager(
            @Qualifier("caffeineCacheManager") CacheManager caffeineCacheManager,
            CacheStatisticsService statisticsService) {
        return new DecoratingCacheManager(caffeineCacheManager, "Caffeine_L1", statisticsService);
    }

    /**
     * L2 Redis 缓存的日志装饰器版本
     * 这个 Bean 可以被手动指定使用
     */
    @Bean("redisCacheManagerWithLogs")
    public CacheManager decoratingRedisManager(
            @Qualifier("redisCacheManager") CacheManager redisCacheManager,
            CacheStatisticsService statisticsService) {
        return new DecoratingCacheManager(redisCacheManager, "Redis_L2", statisticsService);
    }


    /**
     * 默认的、多级的、@Primary 的缓存管理器
     * 如果 @Cacheable 不指定 cacheManager，则默认使用这个
     */
    @Bean
    @Primary
    public CacheManager cacheManager(
            @Qualifier("caffeineCacheManagerWithLogs") CacheManager decoratingCaffeineManager,
            @Qualifier("redisCacheManagerWithLogs") CacheManager decoratingRedisManager) {
        CompositeCacheManager compositeCacheManager = new CompositeCacheManager(decoratingCaffeineManager, decoratingRedisManager);
        compositeCacheManager.setFallbackToNoOpCache(true);
        return compositeCacheManager;
    }

}
