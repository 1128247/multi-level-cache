package com.main.level3cache.service;

import com.main.level3cache.entity.Action;

import java.util.List;

public interface ActionService {

  List<Action> findActionByRefName(String refName);

  Action findById(Long commentId);

  List<Action> findAll();
}
