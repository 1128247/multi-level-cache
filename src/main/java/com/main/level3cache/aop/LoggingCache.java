package com.main.level3cache.aop;

import com.main.level3cache.service.CacheStatisticsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.Cache;

import java.util.concurrent.Callable;

@Slf4j
public class LoggingCache implements Cache {

  private final Cache delegate;
  private final String cacheName;
  private final String source; // 缓存来源: Caffeine_L1 or Redis_L2
  private final CacheStatisticsService statisticsService;

  public LoggingCache(Cache delegate, String source, CacheStatisticsService statisticsService) {
    this.delegate = delegate;
    this.cacheName = delegate.getName();
    this.source = source;
    this.statisticsService = statisticsService;
  }

  @Override
  public String getName() {
    return delegate.getName();
  }

  @Override
  public Object getNativeCache() {
    return delegate.getNativeCache();
  }

  @Override
  public ValueWrapper get(Object key) {
    long startTime = System.currentTimeMillis();
    ValueWrapper valueWrapper = delegate.get(key);
    long endTime = System.currentTimeMillis();
    long responseTime = endTime - startTime;
    
    if (valueWrapper != null) {
      log.info("✅ Cache HIT: level={}, cache_name={}, key={}, response_time={}ms", 
          source, cacheName, key, responseTime);
      statisticsService.recordCacheHit(source, cacheName, key.toString(), responseTime);
    } else {
      log.info("❌ Cache MISS: level={}, cache_name={}, key={}, response_time={}ms", 
          source, cacheName, key, responseTime);
      statisticsService.recordCacheMiss(source, cacheName, key.toString(), responseTime);
    }
    return valueWrapper;
  }

  @Override
  public <T> T get(Object key, Class<T> type) {
    long startTime = System.currentTimeMillis();
    T value = delegate.get(key, type);
    long endTime = System.currentTimeMillis();
    long responseTime = endTime - startTime;
    
    if (value != null) {
      log.info("✅ Cache HIT: level={}, cache_name={}, key={}, type={}, response_time={}ms", 
          source, cacheName, key, type.getSimpleName(), responseTime);
      statisticsService.recordCacheHit(source, cacheName, key.toString(), responseTime);
    } else {
      log.info("❌ Cache MISS: level={}, cache_name={}, key={}, type={}, response_time={}ms", 
          source, cacheName, key, type.getSimpleName(), responseTime);
      statisticsService.recordCacheMiss(source, cacheName, key.toString(), responseTime);
    }
    return value;
  }

  @Override
  public <T> T get(Object key, Callable<T> valueLoader) {
    long startTime = System.currentTimeMillis();
    ValueWrapper valueWrapper = get(key);
    if (valueWrapper != null) {
      long endTime = System.currentTimeMillis();
      log.info("✅ Cache HIT (with loader): level={}, cache_name={}, key={}, response_time={}ms", 
          source, cacheName, key, (endTime - startTime));
      return (T) valueWrapper.get();
    }
    
    try {
      T value = valueLoader.call();
      put(key, value);
      long endTime = System.currentTimeMillis();
      log.info("🔄 Cache LOADED: level={}, cache_name={}, key={}, response_time={}ms", 
          source, cacheName, key, (endTime - startTime));
      return value;
    } catch (Exception e) {
      long endTime = System.currentTimeMillis();
      log.error("❌ Cache LOAD ERROR: level={}, cache_name={}, key={}, response_time={}ms, error={}", 
          source, cacheName, key, (endTime - startTime), e.getMessage());
      throw new ValueRetrievalException(key, valueLoader, e);
    }
  }

  @Override
  public void put(Object key, Object value) {
    long startTime = System.currentTimeMillis();
    delegate.put(key, value);
    long endTime = System.currentTimeMillis();
    log.info("💾 Cache PUT: level={}, cache_name={}, key={}, response_time={}ms", 
        source, cacheName, key, (endTime - startTime));
  }

  @Override
  public ValueWrapper putIfAbsent(Object key, Object value) {
    long startTime = System.currentTimeMillis();
    ValueWrapper result = delegate.putIfAbsent(key, value);
    long endTime = System.currentTimeMillis();
    
    if (result == null) {
      log.info("💾 Cache PUT_IF_ABSENT (new): level={}, cache_name={}, key={}, response_time={}ms", 
          source, cacheName, key, (endTime - startTime));
    } else {
      log.info("💾 Cache PUT_IF_ABSENT (existing): level={}, cache_name={}, key={}, response_time={}ms", 
          source, cacheName, key, (endTime - startTime));
    }
    return result;
  }

  @Override
  public void evict(Object key) {
    long startTime = System.currentTimeMillis();
    delegate.evict(key);
    long endTime = System.currentTimeMillis();
    log.info("🗑️ Cache EVICT: level={}, cache_name={}, key={}, response_time={}ms", 
        source, cacheName, key, (endTime - startTime));
  }

  @Override
  public void clear() {
    long startTime = System.currentTimeMillis();
    delegate.clear();
    long endTime = System.currentTimeMillis();
    log.info("🧹 Cache CLEAR: level={}, cache_name={}, response_time={}ms", 
        source, cacheName, (endTime - startTime));
  }
}
