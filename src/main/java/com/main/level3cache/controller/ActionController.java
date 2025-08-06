package com.main.level3cache.controller;

import com.main.level3cache.service.ActionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actions")
@RequiredArgsConstructor
public class ActionController {

  private final ActionService actionService;

  @GetMapping("/refName/{refName}")
  public String getActionByRefName(String refName) {
    return actionService.findActionByRefName(refName).toString();
  }
  @GetMapping("/id/{id}")
  public String getActionByCommentId(@PathVariable("id") Long id) {
    return actionService.findById(id).toString();
  }
  @GetMapping("/all")
  public String getAllActions() {
    return actionService.findAll().toString();
  }

}
