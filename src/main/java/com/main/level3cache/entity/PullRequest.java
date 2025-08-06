package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "pull_request")
public class PullRequest {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "type")
  private Integer type;

  @Column(name = "status")
  private Integer status;

  @Lob
  @Column(name = "conflicted_files")
  private String conflictedFiles;

  @Column(name = "commits_ahead")
  private Integer commitsAhead;

  @Column(name = "commits_behind")
  private Integer commitsBehind;

  @Lob
  @Column(name = "changed_protected_files")
  private String changedProtectedFiles;

  @Column(name = "issue_id")
  private Long issueId;

  @Column(name = "`index`")
  private Long index;

  @Column(name = "head_repo_id")
  private Long headRepoId;

  @Column(name = "base_repo_id")
  private Long baseRepoId;

  @Column(name = "head_branch")
  private String headBranch;

  @Column(name = "base_branch")
  private String baseBranch;

  @Column(name = "merge_base", length = 40)
  private String mergeBase;

  @ColumnDefault("0")
  @Column(name = "allow_maintainer_edit", nullable = false)
  private Boolean allowMaintainerEdit = false;

  @Column(name = "has_merged")
  private Boolean hasMerged;

  @Column(name = "merged_commit_id", length = 40)
  private String mergedCommitId;

  @Column(name = "merger_id")
  private Long mergerId;

  @Column(name = "merged_unix")
  private Long mergedUnix;

  @ColumnDefault("0")
  @Column(name = "flow", nullable = false)
  private Integer flow;

}