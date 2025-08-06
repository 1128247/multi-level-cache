package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "milestone")
public class Milestone {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "name")
  private String name;

  @Lob
  @Column(name = "content")
  private String content;

  @Column(name = "is_closed")
  private Boolean isClosed;

  @Column(name = "num_issues")
  private Integer numIssues;

  @Column(name = "num_closed_issues")
  private Integer numClosedIssues;

  @Column(name = "completeness")
  private Integer completeness;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

  @Column(name = "deadline_unix")
  private Long deadlineUnix;

  @Column(name = "closed_date_unix")
  private Long closedDateUnix;

}