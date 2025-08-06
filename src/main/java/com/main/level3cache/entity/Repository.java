package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "repository")
public class Repository {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "owner_name")
  private String ownerName;

  @Column(name = "lower_name", nullable = false)
  private String lowerName;

  @Column(name = "name", nullable = false)
  private String name;

  @Lob
  @Column(name = "description")
  private String description;

  @Column(name = "website", length = 2048)
  private String website;

  @Column(name = "original_service_type")
  private Integer originalServiceType;

  @Column(name = "original_url", length = 2048)
  private String originalUrl;

  @Column(name = "default_branch")
  private String defaultBranch;

  @Column(name = "num_watches")
  private Integer numWatches;

  @Column(name = "num_stars")
  private Integer numStars;

  @Column(name = "num_forks")
  private Integer numForks;

  @Column(name = "num_issues")
  private Integer numIssues;

  @Column(name = "num_closed_issues")
  private Integer numClosedIssues;

  @Column(name = "num_pulls")
  private Integer numPulls;

  @Column(name = "num_closed_pulls")
  private Integer numClosedPulls;

  @ColumnDefault("0")
  @Column(name = "num_milestones", nullable = false)
  private Integer numMilestones;

  @ColumnDefault("0")
  @Column(name = "num_closed_milestones", nullable = false)
  private Integer numClosedMilestones;

  @ColumnDefault("0")
  @Column(name = "num_projects", nullable = false)
  private Integer numProjects;

  @ColumnDefault("0")
  @Column(name = "num_closed_projects", nullable = false)
  private Integer numClosedProjects;

  @ColumnDefault("0")
  @Column(name = "num_action_runs", nullable = false)
  private Integer numActionRuns;

  @ColumnDefault("0")
  @Column(name = "num_closed_action_runs", nullable = false)
  private Integer numClosedActionRuns;

  @Column(name = "is_private")
  private Boolean isPrivate;

  @Column(name = "is_empty")
  private Boolean isEmpty;

  @Column(name = "is_archived")
  private Boolean isArchived;

  @Column(name = "is_mirror")
  private Boolean isMirror;

  @ColumnDefault("0")
  @Column(name = "status", nullable = false)
  private Integer status;

  @ColumnDefault("0")
  @Column(name = "is_fork", nullable = false)
  private Boolean isFork = false;

  @Column(name = "fork_id")
  private Long forkId;

  @ColumnDefault("0")
  @Column(name = "is_template", nullable = false)
  private Boolean isTemplate = false;

  @Column(name = "template_id")
  private Long templateId;

  @ColumnDefault("0")
  @Column(name = "size", nullable = false)
  private Long size;

  @ColumnDefault("1")
  @Column(name = "is_fsck_enabled", nullable = false)
  private Boolean isFsckEnabled = false;

  @ColumnDefault("0")
  @Column(name = "close_issues_via_commit_in_any_branch", nullable = false)
  private Boolean closeIssuesViaCommitInAnyBranch = false;

  @Lob
  @Column(name = "topics")
  private String topics;

  @Column(name = "trust_model")
  private Integer trustModel;

  @Column(name = "avatar", length = 64)
  private String avatar;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

  @ColumnDefault("0")
  @Column(name = "archived_unix")
  private Long archivedUnix;

}