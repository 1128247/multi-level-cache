package com.main.level3cache.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "project_issue")
public class ProjectIssue {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "issue_id")
  private Long issueId;

  @Column(name = "project_id")
  private Long projectId;

  @Column(name = "project_board_id")
  private Long projectBoardId;

  @ColumnDefault("0")
  @Column(name = "sorting", nullable = false)
  private Long sorting;

}