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
@Table(name = "issue_assignees")
public class IssueAssignee {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "assignee_id")
  private Long assigneeId;

  @Column(name = "issue_id")
  private Long issueId;

}