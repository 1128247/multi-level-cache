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
@Table(name = "action_task")
public class ActionTask {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "job_id")
  private Long jobId;

  @Column(name = "attempt")
  private Long attempt;

  @Column(name = "runner_id")
  private Long runnerId;

  @Column(name = "status")
  private Integer status;

  @Column(name = "started")
  private Long started;

  @Column(name = "stopped")
  private Long stopped;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "commit_sha")
  private String commitSha;

  @Column(name = "is_fork_pull_request")
  private Boolean isForkPullRequest;

  @Column(name = "token_hash")
  private String tokenHash;

  @Column(name = "token_salt")
  private String tokenSalt;

  @Column(name = "token_last_eight")
  private String tokenLastEight;

  @Column(name = "log_filename")
  private String logFilename;

  @Column(name = "log_in_storage")
  private Boolean logInStorage;

  @Column(name = "log_length")
  private Long logLength;

  @Column(name = "log_size")
  private Long logSize;

  @Column(name = "log_indexes")
  private byte[] logIndexes;

  @Column(name = "log_expired")
  private Boolean logExpired;

  @Column(name = "created")
  private Long created;

  @Column(name = "updated")
  private Long updated;

}