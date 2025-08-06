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
@Table(name = "repo_redirect")
public class RepoRedirect {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "lower_name", nullable = false)
  private String lowerName;

  @Column(name = "redirect_repo_id")
  private Long redirectRepoId;

}