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
@Table(name = "team")
public class Team {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "org_id")
  private Long orgId;

  @Column(name = "lower_name")
  private String lowerName;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "authorize")
  private Integer authorize;

  @Column(name = "num_repos")
  private Integer numRepos;

  @Column(name = "num_members")
  private Integer numMembers;

  @ColumnDefault("0")
  @Column(name = "includes_all_repositories", nullable = false)
  private Boolean includesAllRepositories = false;

  @ColumnDefault("0")
  @Column(name = "can_create_org_repo", nullable = false)
  private Boolean canCreateOrgRepo = false;

}