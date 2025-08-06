package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "issue")
public class Issue {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "`index`")
  private Long index;

  @Column(name = "poster_id")
  private Long posterId;

  @Column(name = "original_author")
  private String originalAuthor;

  @Column(name = "original_author_id")
  private Long originalAuthorId;

  @Column(name = "name")
  private String name;

  @Lob
  @Column(name = "content")
  private String content;

  @Column(name = "milestone_id")
  private Long milestoneId;

  @Column(name = "priority")
  private Integer priority;

  @Column(name = "is_closed")
  private Boolean isClosed;

  @Column(name = "is_pull")
  private Boolean isPull;

  @Column(name = "num_comments")
  private Integer numComments;

  @Column(name = "ref")
  private String ref;

  @ColumnDefault("0")
  @Column(name = "pin_order")
  private Integer pinOrder;

  @Column(name = "deadline_unix")
  private Long deadlineUnix;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

  @Column(name = "closed_unix")
  private Long closedUnix;

  @ColumnDefault("0")
  @Column(name = "is_locked", nullable = false)
  private Boolean isLocked = false;

}