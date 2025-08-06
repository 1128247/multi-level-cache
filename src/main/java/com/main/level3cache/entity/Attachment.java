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
@Table(name = "attachment")
public class Attachment {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uuid", length = 40)
  private String uuid;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "issue_id")
  private Long issueId;

  @Column(name = "release_id")
  private Long releaseId;

  @ColumnDefault("0")
  @Column(name = "uploader_id")
  private Long uploaderId;

  @Column(name = "comment_id")
  private Long commentId;

  @Column(name = "name")
  private String name;

  @ColumnDefault("0")
  @Column(name = "download_count")
  private Long downloadCount;

  @ColumnDefault("0")
  @Column(name = "size")
  private Long size;

  @Column(name = "created_unix")
  private Long createdUnix;

}