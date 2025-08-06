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
@Table(name = "issue_user")
public class IssueUser {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uid")
  private Long uid;

  @Column(name = "issue_id")
  private Long issueId;

  @Column(name = "is_read")
  private Boolean isRead;

  @Column(name = "is_mentioned")
  private Boolean isMentioned;

}