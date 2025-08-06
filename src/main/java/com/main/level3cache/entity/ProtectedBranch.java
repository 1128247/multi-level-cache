package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "protected_branch")
public class ProtectedBranch {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "branch_name")
  private String branchName;

  @ColumnDefault("0")
  @Column(name = "can_push", nullable = false)
  private Boolean canPush = false;

  @Column(name = "enable_whitelist")
  private Boolean enableWhitelist;

  @Lob
  @Column(name = "whitelist_user_i_ds")
  private String whitelistUserIDs;

  @Lob
  @Column(name = "whitelist_team_i_ds")
  private String whitelistTeamIDs;

  @ColumnDefault("0")
  @Column(name = "enable_merge_whitelist", nullable = false)
  private Boolean enableMergeWhitelist = false;

  @ColumnDefault("0")
  @Column(name = "whitelist_deploy_keys", nullable = false)
  private Boolean whitelistDeployKeys = false;

  @Lob
  @Column(name = "merge_whitelist_user_i_ds")
  private String mergeWhitelistUserIDs;

  @Lob
  @Column(name = "merge_whitelist_team_i_ds")
  private String mergeWhitelistTeamIDs;

  @ColumnDefault("0")
  @Column(name = "enable_status_check", nullable = false)
  private Boolean enableStatusCheck = false;

  @Lob
  @Column(name = "status_check_contexts")
  private String statusCheckContexts;

  @ColumnDefault("0")
  @Column(name = "enable_approvals_whitelist", nullable = false)
  private Boolean enableApprovalsWhitelist = false;

  @Lob
  @Column(name = "approvals_whitelist_user_i_ds")
  private String approvalsWhitelistUserIDs;

  @Lob
  @Column(name = "approvals_whitelist_team_i_ds")
  private String approvalsWhitelistTeamIDs;

  @ColumnDefault("0")
  @Column(name = "required_approvals", nullable = false)
  private Long requiredApprovals;

  @ColumnDefault("0")
  @Column(name = "block_on_rejected_reviews", nullable = false)
  private Boolean blockOnRejectedReviews = false;

  @ColumnDefault("0")
  @Column(name = "block_on_official_review_requests", nullable = false)
  private Boolean blockOnOfficialReviewRequests = false;

  @ColumnDefault("0")
  @Column(name = "block_on_outdated_branch", nullable = false)
  private Boolean blockOnOutdatedBranch = false;

  @ColumnDefault("0")
  @Column(name = "dismiss_stale_approvals", nullable = false)
  private Boolean dismissStaleApprovals = false;

  @ColumnDefault("0")
  @Column(name = "require_signed_commits", nullable = false)
  private Boolean requireSignedCommits = false;

  @Lob
  @Column(name = "protected_file_patterns")
  private String protectedFilePatterns;

  @Lob
  @Column(name = "unprotected_file_patterns")
  private String unprotectedFilePatterns;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}