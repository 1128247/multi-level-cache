package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "commit_status")
public class CommitStatus {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "`index`")
  private Long index;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "state", nullable = false, length = 7)
  private String state;

  @Column(name = "sha", nullable = false, length = 64)
  private String sha;

  @Lob
  @Column(name = "target_url")
  private String targetUrl;

  @Lob
  @Column(name = "description")
  private String description;

  @Column(name = "context_hash", length = 40)
  private String contextHash;

  @Lob
  @Column(name = "context")
  private String context;

  @Column(name = "creator_id")
  private Long creatorId;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}