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
@Table(name = "label")
public class Label {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "org_id")
  private Long orgId;

  @Column(name = "name")
  private String name;

  @Column(name = "exclusive")
  private Boolean exclusive;

  @Column(name = "description")
  private String description;

  @Column(name = "color", length = 7)
  private String color;

  @Column(name = "num_issues")
  private Integer numIssues;

  @Column(name = "num_closed_issues")
  private Integer numClosedIssues;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}