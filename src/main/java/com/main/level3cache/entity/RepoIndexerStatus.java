package com.main.level3cache.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "repo_indexer_status")
public class RepoIndexerStatus {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "commit_sha", length = 40)
  private String commitSha;

  @ColumnDefault("0")
  @Column(name = "indexer_type", nullable = false)
  private Integer indexerType;

}