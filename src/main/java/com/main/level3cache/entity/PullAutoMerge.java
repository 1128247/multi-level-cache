package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pull_auto_merge")
public class PullAutoMerge {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "pull_id")
  private Long pullId;

  @Column(name = "doer_id", nullable = false)
  private Long doerId;

  @Column(name = "merge_style", length = 30)
  private String mergeStyle;

  @Lob
  @Column(name = "message")
  private String message;

  @Column(name = "created_unix")
  private Long createdUnix;

}