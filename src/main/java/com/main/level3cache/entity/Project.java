package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "project")
public class Project {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "title", nullable = false)
  private String title;

  @Lob
  @Column(name = "description")
  private String description;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "creator_id", nullable = false)
  private Long creatorId;

  @Column(name = "is_closed")
  private Boolean isClosed;

  @Column(name = "board_type")
  private Integer boardType;

  @Column(name = "card_type")
  private Integer cardType;

  @Column(name = "type")
  private Integer type;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

  @Column(name = "closed_date_unix")
  private Long closedDateUnix;

}