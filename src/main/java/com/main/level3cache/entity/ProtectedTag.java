package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "protected_tag")
public class ProtectedTag {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "name_pattern")
  private String namePattern;

  @Lob
  @Column(name = "allowlist_user_i_ds")
  private String allowlistUserIDs;

  @Lob
  @Column(name = "allowlist_team_i_ds")
  private String allowlistTeamIDs;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}