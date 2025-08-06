package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "`release`")
public class Release {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "publisher_id")
  private Long publisherId;

  @Column(name = "tag_name")
  private String tagName;

  @Column(name = "original_author")
  private String originalAuthor;

  @Column(name = "original_author_id")
  private Long originalAuthorId;

  @Column(name = "lower_tag_name")
  private String lowerTagName;

  @Column(name = "target")
  private String target;

  @Column(name = "title")
  private String title;

  @Column(name = "sha1", length = 40)
  private String sha1;

  @Column(name = "num_commits")
  private Long numCommits;

  @Lob
  @Column(name = "note")
  private String note;

  @ColumnDefault("0")
  @Column(name = "is_draft", nullable = false)
  private Boolean isDraft = false;

  @ColumnDefault("0")
  @Column(name = "is_prerelease", nullable = false)
  private Boolean isPrerelease = false;

  @ColumnDefault("0")
  @Column(name = "is_tag", nullable = false)
  private Boolean isTag = false;

  @Column(name = "created_unix")
  private Long createdUnix;

}