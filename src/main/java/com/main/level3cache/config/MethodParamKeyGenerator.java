package com.main.level3cache.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Component("methodParamKeyGenerator")
public class MethodParamKeyGenerator implements KeyGenerator {

  private static final String SEPARATOR = ":";
  private static final String PARAMETER_SEPARATOR = ",";

  @Override
  public Object generate(Object target, Method method, Object... params) {
    StringBuilder keyBuilder = new StringBuilder();

    // 1. 添加类名和方法名作为前缀，构建命名空间
    keyBuilder.append(target.getClass().getSimpleName())
        .append(SEPARATOR)
        .append(method.getName())
        .append(SEPARATOR);

    // 2. 处理参数列表，确保其唯一性
    if (params.length > 0) {
      String paramString = Arrays.stream(params)
          .map(param -> {
            if (param == null) {
              return "NULL";
            }
            if (param.getClass().isArray() || param instanceof Collection) {
              // 数组或集合，转换为字符串表示，避免使用默认的 toString()
              return "[]" + paramToString(param);
            }
            // 对于复杂对象，依赖其 toString() 方法。推荐重写 toString()
            return param.toString();
          })
          .collect(Collectors.joining(PARAMETER_SEPARATOR));
      keyBuilder.append("[").append(paramString).append("]");
    } else {
      // 没有参数时，用一个空括号表示
      keyBuilder.append("[]");
    }

    return keyBuilder.toString();
  }

  // 辅助方法：将数组或集合转换为字符串
  private String paramToString(Object param) {
    if (param == null) return "null";
    if (param.getClass().isArray()) {
      return Arrays.toString((Object[]) param);
    }
    if (param instanceof Collection) {
      return param.toString();
    }
    return param.toString();
  }
}
