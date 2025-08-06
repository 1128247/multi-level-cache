package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "lfs_lock")
public class LfsLock {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id", nullable = false)
  private Long repoId;

  @Column(name = "owner_id", nullable = false)
  private Long ownerId;

  @Lob
  @Column(name = "path")
  private String path;

  @Column(name = "created")
  private Instant created;

}