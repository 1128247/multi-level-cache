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
@Table(name = "language_stat")
public class LanguageStat {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id", nullable = false)
  private Long repoId;

  @Column(name = "commit_id")
  private String commitId;

  @Column(name = "is_primary")
  private Boolean isPrimary;

  @Column(name = "language", nullable = false, length = 50)
  private String language;

  @ColumnDefault("0")
  @Column(name = "size", nullable = false)
  private Long size;

  @Column(name = "created_unix")
  private Long createdUnix;

}