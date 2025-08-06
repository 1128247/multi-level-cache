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
@Table(name = "project_board")
public class ProjectBoard {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "title")
  private String title;

  @ColumnDefault("0")
  @Column(name = "`default`", nullable = false)
  private Boolean defaultField = false;

  @ColumnDefault("0")
  @Column(name = "sorting", nullable = false)
  private Integer sorting;

  @Column(name = "color", length = 7)
  private String color;

  @Column(name = "project_id", nullable = false)
  private Long projectId;

  @Column(name = "creator_id", nullable = false)
  private Long creatorId;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}