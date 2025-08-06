package com.main.level3cache.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKey;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import java.lang.reflect.Method;
import java.util.*;
@Component("hashKeyGenerator")
public class HashKeyGenerator implements KeyGenerator {

  private static final ObjectMapper objectMapper = new ObjectMapper();

  @Override
  public Object generate(Object target, Method method, Object... params) {
    StringBuilder keyBuilder = new StringBuilder();

    // 1. 构建 Key 的命名空间: 类名:方法名
    keyBuilder.append(target.getClass().getSimpleName()).append(":");
    keyBuilder.append(method.getName()).append(":");

    // 2. 将所有参数组合成一个对象，并序列化为 JSON 字符串
    String paramsJson;
    try {
      // Arrays.asList(params) 将 Object... 转换为 List<Object>
      // ObjectMapper 会处理 List 中的复杂对象，并将其序列化为 JSON
      paramsJson = objectMapper.writeValueAsString(Arrays.asList(params));
    } catch (JsonProcessingException e) {
      // 如果序列化失败，使用一个简单的Key，并记录错误
      System.err.println("Failed to serialize parameters for cache key, falling back to simple key. " + e.getMessage());
      return new SimpleKey(target.getClass().getSimpleName(), method.getName(), Arrays.toString(params));
    }

    // 3. 对序列化后的参数字符串进行哈希化
    String paramsHash = DigestUtils.md5DigestAsHex(paramsJson.getBytes());

    keyBuilder.append(paramsHash);

    return keyBuilder.toString();
  }
}
