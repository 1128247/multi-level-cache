package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "comment")
public class Comment {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "type")
  private Integer type;

  @Column(name = "poster_id")
  private Long posterId;

  @Column(name = "original_author")
  private String originalAuthor;

  @Column(name = "original_author_id")
  private Long originalAuthorId;

  @Column(name = "issue_id")
  private Long issueId;

  @Column(name = "label_id")
  private Long labelId;

  @Column(name = "old_project_id")
  private Long oldProjectId;

  @Column(name = "project_id")
  private Long projectId;

  @Column(name = "old_milestone_id")
  private Long oldMilestoneId;

  @Column(name = "milestone_id")
  private Long milestoneId;

  @Column(name = "time_id")
  private Long timeId;

  @Column(name = "assignee_id")
  private Long assigneeId;

  @Column(name = "removed_assignee")
  private Boolean removedAssignee;

  @ColumnDefault("0")
  @Column(name = "assignee_team_id", nullable = false)
  private Long assigneeTeamId;

  @Column(name = "resolve_doer_id")
  private Long resolveDoerId;

  @Column(name = "old_title")
  private String oldTitle;

  @Column(name = "new_title")
  private String newTitle;

  @Column(name = "old_ref")
  private String oldRef;

  @Column(name = "new_ref")
  private String newRef;

  @Column(name = "dependent_issue_id")
  private Long dependentIssueId;

  @Column(name = "commit_id")
  private Long commitId;

  @Column(name = "line")
  private Long line;

  @Column(name = "tree_path")
  private String treePath;

  @Lob
  @Column(name = "content")
  private String content;

  @Lob
  @Column(name = "patch")
  private String patch;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

  @Column(name = "commit_sha", length = 40)
  private String commitSha;

  @Column(name = "review_id")
  private Long reviewId;

  @Column(name = "invalidated")
  private Boolean invalidated;

  @Column(name = "ref_repo_id")
  private Long refRepoId;

  @Column(name = "ref_issue_id")
  private Long refIssueId;

  @Column(name = "ref_comment_id")
  private Long refCommentId;

  @Column(name = "ref_action")
  private Short refAction;

  @Column(name = "ref_is_pull")
  private Boolean refIsPull;

}