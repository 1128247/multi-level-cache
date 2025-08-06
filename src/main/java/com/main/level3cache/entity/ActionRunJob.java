package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "action_run_job")
public class ActionRunJob {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "run_id")
  private Long runId;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "commit_sha")
  private String commitSha;

  @Column(name = "is_fork_pull_request")
  private Boolean isForkPullRequest;

  @Column(name = "name")
  private String name;

  @Column(name = "attempt")
  private Long attempt;

  @Column(name = "workflow_payload")
  private byte[] workflowPayload;

  @Column(name = "job_id")
  private String jobId;

  @Lob
  @Column(name = "needs")
  private String needs;

  @Lob
  @Column(name = "runs_on")
  private String runsOn;

  @Column(name = "task_id")
  private Long taskId;

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