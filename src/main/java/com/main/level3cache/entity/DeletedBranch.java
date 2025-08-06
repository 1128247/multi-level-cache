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
@Table(name = "deleted_branch")
public class DeletedBranch {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id", nullable = false)
  private Long repoId;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "commit", nullable = false)
  private String commit;

  @Column(name = "deleted_by_id")
  private Long deletedById;

  @Column(name = "deleted_unix")
  private Long deletedUnix;

}