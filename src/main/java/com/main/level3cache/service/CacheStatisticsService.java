package com.main.level3cache.service;

import java.util.Map;

public interface CacheStatisticsService {
    
    /**
     * 记录缓存命中
     * @param cacheLevel 缓存级别 (Caffeine_L1, Redis_L2)
     * @param cacheName 缓存名称
     * @param key 缓存键
     * @param responseTime 响应时间(毫秒)
     */
    void recordCacheHit(String cacheLevel, String cacheName, String key, long responseTime);
    
    /**
     * 记录缓存未命中
     * @param cacheLevel 缓存级别
     * @param cacheName 缓存名称
     * @param key 缓存键
     * @param responseTime 响应时间(毫秒)
     */
    void recordCacheMiss(String cacheLevel, String cacheName, String key, long responseTime);
    
    /**
     * 获取缓存统计信息
     * @return 统计信息映射
     */
    Map<String, Object> getCacheStatistics();
    
    /**
     * 重置统计信息
     */
    void resetStatistics();
} 