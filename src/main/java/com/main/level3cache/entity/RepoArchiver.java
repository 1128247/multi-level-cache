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
@Table(name = "repo_archiver")
public class RepoArchiver {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "type")
  private Integer type;

  @Column(name = "status")
  private Integer status;

  @Column(name = "commit_id", length = 40)
  private String commitId;

  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

}