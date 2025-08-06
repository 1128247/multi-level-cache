package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "issue_content_history")
public class IssueContentHistory {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "poster_id")
  private Long posterId;

  @Column(name = "issue_id")
  private Long issueId;

  @Column(name = "comment_id")
  private Long commentId;

  @Column(name = "edited_unix")
  private Long editedUnix;

  @Lob
  @Column(name = "content_text")
  private String contentText;

  @Column(name = "is_first_created")
  private Boolean isFirstCreated;

  @Column(name = "is_deleted")
  private Boolean isDeleted;

}