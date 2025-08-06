package com.main.level3cache.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "action_task_step")
public class ActionTaskStep {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "task_id")
  private Long taskId;

  @Column(name = "`index`")
  private Long index;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "status")
  private Integer status;

  @Column(name = "log_index")
  private Long logIndex;

  @Column(name = "log_length")
  private Long logLength;

  @Column(name = "started")
  private Long started;

  @Column(name = "stopped")
  private Long stopped;

  @Column(name = "created")
  private Long created;

  @Column(name = "updated")
  private Long updated;

}