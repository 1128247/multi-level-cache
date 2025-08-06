package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "action_run")
public class ActionRun {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "title")
  private String title;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "workflow_id")
  private String workflowId;

  @Column(name = "`index`")
  private Long index;

  @Column(name = "trigger_user_id")
  private Long triggerUserId;

  @Column(name = "ref")
  private String ref;

  @Column(name = "commit_sha")
  private String commitSha;

  @Column(name = "is_fork_pull_request")
  private Boolean isForkPullRequest;

  @Column(name = "need_approval")
  private Boolean needApproval;

  @Column(name = "approved_by")
  private Long approvedBy;

  @Column(name = "event")
  private String event;

  @Lob
  @Column(name = "event_payload")
  private String eventPayload;

  @Column(name = "status")
  private Integer status;

  @Column(name = "started")
  private Long started;

  @Column(name = "stopped")
  private Long stopped;

  @Column(name = "created")
  private Long created;

  @Column(name = "updated")
  private Long updated;

}