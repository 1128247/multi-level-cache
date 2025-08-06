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
@Table(name = "notification")
public class Notification {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "repo_id", nullable = false)
  private Long repoId;

  @Column(name = "status", nullable = false)
  private Short status;

  @Column(name = "source", nullable = false)
  private Short source;

  @Column(name = "issue_id", nullable = false)
  private Long issueId;

  @Column(name = "commit_id")
  private String commitId;

  @Column(name = "comment_id")
  private Long commentId;

  @Column(name = "updated_by", nullable = false)
  private Long updatedBy;

  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

  @Column(name = "updated_unix", nullable = false)
  private Long updatedUnix;

}