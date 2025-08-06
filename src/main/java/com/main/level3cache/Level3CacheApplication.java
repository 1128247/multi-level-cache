package com.main.level3cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableCaching
@SpringBootApplication
@EnableAspectJAutoProxy
public class Level3CacheApplication {

  public static void main(String[] args) {
    SpringApplication.run(Level3CacheApplication.class, args);
  }

}
