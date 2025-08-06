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
@Table(name = "issue_watch")
public class IssueWatch {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Column(name = "issue_id", nullable = false)
  private Long issueId;

  @Column(name = "is_watching", nullable = false)
  private Boolean isWatching = false;

  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

  @Column(name = "updated_unix", nullable = false)
  private Long updatedUnix;

}