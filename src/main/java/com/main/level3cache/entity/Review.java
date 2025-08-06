package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "review")
public class Review {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "type")
  private Integer type;

  @Column(name = "reviewer_id")
  private Long reviewerId;

  @ColumnDefault("0")
  @Column(name = "reviewer_team_id", nullable = false)
  private Long reviewerTeamId;

  @Column(name = "original_author")
  private String originalAuthor;

  @Column(name = "original_author_id")
  private Long originalAuthorId;

  @Column(name = "issue_id")
  private Long issueId;

  @Lob
  @Column(name = "content")
  private String content;

  @ColumnDefault("0")
  @Column(name = "official", nullable = false)
  private Boolean official = false;

  @Column(name = "commit_id", length = 40)
  private String commitId;

  @ColumnDefault("0")
  @Column(name = "stale", nullable = false)
  private Boolean stale = false;

  @ColumnDefault("0")
  @Column(name = "dismissed", nullable = false)
  private Boolean dismissed = false;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}