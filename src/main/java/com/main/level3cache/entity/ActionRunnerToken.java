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
@Table(name = "action_runner_token")
public class ActionRunnerToken {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "token")
  private String token;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "is_active")
  private Boolean isActive;

  @Column(name = "created")
  private Long created;

  @Column(name = "updated")
  private Long updated;

  @Column(name = "deleted")
  private Long deleted;

}