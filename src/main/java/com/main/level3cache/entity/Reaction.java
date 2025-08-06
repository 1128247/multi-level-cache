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
@Table(name = "reaction")
public class Reaction {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "type", nullable = false)
  private String type;

  @Column(name = "issue_id", nullable = false)
  private Long issueId;

  @Column(name = "comment_id")
  private Long commentId;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @ColumnDefault("0")
  @Column(name = "original_author_id", nullable = false)
  private Long originalAuthorId;

  @Column(name = "original_author")
  private String originalAuthor;

  @Column(name = "created_unix")
  private Long createdUnix;

}