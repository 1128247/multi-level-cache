package com.main.level3cache.config;

import com.main.level3cache.aop.LoggingCache;
import com.main.level3cache.service.CacheStatisticsService;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

import java.util.Collection;

public class DecoratingCacheManager implements CacheManager {
  private final CacheManager delegate;
  private final String source;
  private final CacheStatisticsService statisticsService;

  public DecoratingCacheManager(CacheManager delegate, String source, CacheStatisticsService statisticsService) {
    this.delegate = delegate;
    this.source = source;
    this.statisticsService = statisticsService;
  }

  @Override
  public Cache getCache(String name) {
    Cache cache = delegate.getCache(name);
    if (cache != null) {
      // 如果缓存实例存在，就用 LoggingCache 动态包装它
      return new LoggingCache(cache, source, statisticsService);
    }
    return null;
  }

  @Override
  public Collection<String> getCacheNames() {
    return delegate.getCacheNames();
  }
}
