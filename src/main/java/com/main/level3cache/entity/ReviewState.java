package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "review_state")
public class ReviewState {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @ColumnDefault("0")
  @Column(name = "pull_id", nullable = false)
  private Long pullId;

  @Column(name = "commit_sha", nullable = false, length = 40)
  private String commitSha;

  @Lob
  @Column(name = "updated_files", nullable = false)
  private String updatedFiles;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}