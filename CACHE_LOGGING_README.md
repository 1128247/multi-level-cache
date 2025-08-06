# 三级缓存日志系统

这个项目实现了一个完整的三级缓存日志系统，能够详细记录缓存命中情况、响应时间和统计信息。

## 功能特性

### 1. 三级缓存架构
- **L1缓存**: Caffeine (本地内存缓存)
- **L2缓存**: Redis (分布式缓存)
- **L3缓存**: 数据库 (持久化存储)

### 2. 详细的日志记录
- ✅ 缓存命中日志 (包含级别、缓存名、键、响应时间)
- ❌ 缓存未命中日志
- 💾 缓存写入日志
- 🗑️ 缓存清除日志
- 🚀 方法执行开始日志
- ✅ 方法执行完成日志

### 3. 缓存统计功能
- 实时统计缓存命中率
- 按缓存级别分别统计
- 平均响应时间统计
- 支持统计信息重置

## 日志格式示例

### 缓存命中日志
```
✅ Cache HIT: level=Caffeine_L1, cache_name=actions, key=findActionByRefName[test], response_time=2ms
```

### 缓存未命中日志
```
❌ Cache MISS: level=Redis_L2, cache_name=actions, key=findById[123], response_time=15ms
```

### 方法执行日志
```
🚀 Method START: method=findActionByRefName, cache_name=actions, key=findActionByRefName[test]
✅ Method COMPLETED with CACHE WRITE: method=findActionByRefName, cache_name=actions, key=findActionByRefName[test], execution_time=45ms
```

## API 接口

### 1. 缓存统计接口
```bash
# 获取缓存统计信息
GET /api/cache/statistics

# 重置统计信息
POST /api/cache/statistics/reset

# 健康检查
GET /api/cache/statistics/health
```

### 2. 缓存测试接口
```bash
# 测试按refName查询 (会触发缓存)
GET /api/cache/test/actions/{refName}

# 测试按ID查询 (会触发缓存)
GET /api/cache/test/actions/id/{id}

# 测试查询所有 (会触发缓存)
GET /api/cache/test/actions/all
```

## 统计信息示例

```json
{
  "overall": {
    "totalRequests": 100,
    "totalHits": 75,
    "totalMisses": 25,
    "hitRate": "75.00%"
  },
  "byLevel": {
    "Caffeine_L1:actions": {
      "level": "Caffeine_L1",
      "cacheName": "actions",
      "requests": 60,
      "hits": 50,
      "misses": 10,
      "hitRate": "83.33%",
      "avgResponseTime": "1.25ms"
    },
    "Redis_L2:actions": {
      "level": "Redis_L2",
      "cacheName": "actions",
      "requests": 40,
      "hits": 25,
      "misses": 15,
      "hitRate": "62.50%",
      "avgResponseTime": "12.50ms"
    }
  }
}
```

## 使用方法

### 1. 在Service方法上添加@Cacheable注解
```java
@Cacheable(value = "actions", key = "#root.methodName + #root.args")
public List<Action> findActionByRefName(String refName) {
    // 业务逻辑
    return actionRepository.findAll(example);
}
```

### 2. 查看日志输出
启动应用后，所有缓存操作都会自动记录到日志中，包括：
- 缓存命中/未命中情况
- 命中的缓存级别 (L1/L2)
- 缓存键值
- 响应时间

### 3. 查看统计信息
访问 `http://localhost:8080/api/cache/statistics` 查看实时统计信息。

## 配置说明

### 缓存配置 (CacheConfiguration.java)
- Caffeine L1缓存: 10分钟过期，最大1000条
- Redis L2缓存: 1小时过期
- 使用CompositeCacheManager组合两个缓存管理器

### 日志级别
- INFO: 缓存命中/未命中、方法执行
- DEBUG: 统计服务内部记录
- WARN: 缓存检查失败
- ERROR: 缓存加载错误

## 技术栈

- Spring Boot
- Spring Cache
- Caffeine (本地缓存)
- Redis (分布式缓存)
- Spring AOP (切面编程)
- Lombok (简化代码)

## 注意事项

1. 确保Redis服务已启动
2. 缓存键的生成策略会影响缓存命中率
3. 统计信息存储在内存中，应用重启后会重置
4. 日志输出较多，建议在生产环境中调整日志级别 