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
@Table(name = "star")
public class Star {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uid")
  private Long uid;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "created_unix")
  private Long createdUnix;

}