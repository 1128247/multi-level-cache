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
@Table(name = "renamed_branch")
public class RenamedBranch {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id", nullable = false)
  private Long repoId;

  @Column(name = "`from`")
  private String from;

  @Column(name = "`to`")
  private String to;

  @Column(name = "created_unix")
  private Long createdUnix;

}