package com.main.level3cache.controller;

import com.main.level3cache.service.CacheStatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/cache/statistics")
@RequiredArgsConstructor
public class CacheStatisticsController {
    
    private final CacheStatisticsService statisticsService;
    
    @GetMapping
    public ResponseEntity<Map<String, Object>> getCacheStatistics() {
        return ResponseEntity.ok(statisticsService.getCacheStatistics());
    }
    
    @PostMapping("/reset")
    public ResponseEntity<String> resetStatistics() {
        statisticsService.resetStatistics();
        return ResponseEntity.ok("缓存统计信息已重置");
    }
    
    @GetMapping("/health")
    public ResponseEntity<Map<String, String>> health() {
        return ResponseEntity.ok(Map.of(
            "status", "UP",
            "message", "缓存统计服务运行正常"
        ));
    }
} 