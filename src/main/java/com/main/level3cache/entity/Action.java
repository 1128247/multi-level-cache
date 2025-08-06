package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "action")
@ToString
public class Action {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "op_type")
  private Integer opType;

  @Column(name = "act_user_id")
  private Long actUserId;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "comment_id")
  private Long commentId;

  @ColumnDefault("0")
  @Column(name = "is_deleted", nullable = false)
  private Boolean isDeleted = false;

  @Column(name = "ref_name")
  private String refName;

  @ColumnDefault("0")
  @Column(name = "is_private", nullable = false)
  private Boolean isPrivate = false;

  @Lob
  @Column(name = "content")
  private String content;

  @Column(name = "created_unix")
  private Long createdUnix;

}