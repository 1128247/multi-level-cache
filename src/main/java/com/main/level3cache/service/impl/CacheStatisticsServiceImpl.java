package com.main.level3cache.service.impl;

import com.main.level3cache.service.CacheStatisticsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Slf4j
@Service
public class CacheStatisticsServiceImpl implements CacheStatisticsService {
    
    private final ConcurrentHashMap<String, AtomicLong> hitCounts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AtomicLong> missCounts = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AtomicLong> totalResponseTimes = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, AtomicLong> requestCounts = new ConcurrentHashMap<>();
    
    @Override
    public void recordCacheHit(String cacheLevel, String cacheName, String key, long responseTime) {
        String cacheKey = cacheLevel + ":" + cacheName;
        
        hitCounts.computeIfAbsent(cacheKey, k -> new AtomicLong(0)).incrementAndGet();
        requestCounts.computeIfAbsent(cacheKey, k -> new AtomicLong(0)).incrementAndGet();
        totalResponseTimes.computeIfAbsent(cacheKey, k -> new AtomicLong(0)).addAndGet(responseTime);
        
        log.debug("Cache hit recorded: level={}, cache={}, key={}, responseTime={}ms", 
            cacheLevel, cacheName, key, responseTime);
    }
    
    @Override
    public void recordCacheMiss(String cacheLevel, String cacheName, String key, long responseTime) {
        String cacheKey = cacheLevel + ":" + cacheName;
        
        missCounts.computeIfAbsent(cacheKey, k -> new AtomicLong(0)).incrementAndGet();
        requestCounts.computeIfAbsent(cacheKey, k -> new AtomicLong(0)).incrementAndGet();
        totalResponseTimes.computeIfAbsent(cacheKey, k -> new AtomicLong(0)).addAndGet(responseTime);
        
        log.debug("Cache miss recorded: level={}, cache={}, key={}, responseTime={}ms", 
            cacheLevel, cacheName, key, responseTime);
    }
    
    @Override
    public Map<String, Object> getCacheStatistics() {
        Map<String, Object> statistics = new ConcurrentHashMap<>();
        
        // 总体统计
        long totalHits = hitCounts.values().stream().mapToLong(AtomicLong::get).sum();
        long totalMisses = missCounts.values().stream().mapToLong(AtomicLong::get).sum();
        long totalRequests = totalHits + totalMisses;
        double overallHitRate = totalRequests > 0 ? (double) totalHits / totalRequests * 100 : 0.0;
        
        statistics.put("overall", Map.of(
            "totalRequests", totalRequests,
            "totalHits", totalHits,
            "totalMisses", totalMisses,
            "hitRate", String.format("%.2f%%", overallHitRate)
        ));
        
        // 按缓存级别统计
        Map<String, Object> levelStats = new ConcurrentHashMap<>();
        
        for (String cacheKey : requestCounts.keySet()) {
            String[] parts = cacheKey.split(":", 2);
            String level = parts[0];
            String cacheName = parts[1];
            
            long hits = hitCounts.getOrDefault(cacheKey, new AtomicLong(0)).get();
            long misses = missCounts.getOrDefault(cacheKey, new AtomicLong(0)).get();
            long requests = requestCounts.getOrDefault(cacheKey, new AtomicLong(0)).get();
            long totalResponseTime = totalResponseTimes.getOrDefault(cacheKey, new AtomicLong(0)).get();
            
            double hitRate = requests > 0 ? (double) hits / requests * 100 : 0.0;
            double avgResponseTime = requests > 0 ? (double) totalResponseTime / requests : 0.0;
            
            levelStats.put(cacheKey, Map.of(
                "level", level,
                "cacheName", cacheName,
                "requests", requests,
                "hits", hits,
                "misses", misses,
                "hitRate", String.format("%.2f%%", hitRate),
                "avgResponseTime", String.format("%.2fms", avgResponseTime)
            ));
        }
        
        statistics.put("byLevel", levelStats);
        
        return statistics;
    }
    
    @Override
    public void resetStatistics() {
        hitCounts.clear();
        missCounts.clear();
        totalResponseTimes.clear();
        requestCounts.clear();
        log.info("Cache statistics have been reset");
    }
} 