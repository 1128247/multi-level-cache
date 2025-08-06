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
@Table(name = "access")
public class Access {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "mode")
  private Integer mode;

}