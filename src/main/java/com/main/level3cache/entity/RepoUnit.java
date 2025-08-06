package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "repo_unit")
public class RepoUnit {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "type")
  private Integer type;

  @Lob
  @Column(name = "config")
  private String config;

  @Column(name = "created_unix")
  private Long createdUnix;

}