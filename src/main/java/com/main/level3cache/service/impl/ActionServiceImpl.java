package com.main.level3cache.service.impl;

import com.main.level3cache.entity.Action;
import com.main.level3cache.repository.ActionRepository;
import com.main.level3cache.service.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActionServiceImpl implements ActionService {
  private final ActionRepository actionRepository;

  @Cacheable(value = "actions", key = "#root.methodName + #root.args")
  @Override
  public List<Action> findActionByRefName(String refName) {
    Action action = new Action();
    action.setRefName(refName);
    ExampleMatcher exampleMatcher = ExampleMatcher.matching()
        .withMatcher("refName", ExampleMatcher.GenericPropertyMatchers.exact());
    Example<Action> example = Example.of(action, exampleMatcher);
    return actionRepository.findAll(example);
  }

  @Cacheable(value = "actions", key = "#root.methodName", cacheManager = "redisCacheManagerWithLogs")
  @Override
  public Action findById(Long commentId) {
    return actionRepository.findById(commentId).orElse(null);
  }
  @Cacheable(value = "actions", key = "#root.methodName")
  @Override
  public List<Action> findAll() {
    return actionRepository.findAll();
  }
}
