package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "push_mirror")
public class PushMirror {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "remote_name")
  private String remoteName;

  @ColumnDefault("1")
  @Column(name = "sync_on_commit", nullable = false)
  private Boolean syncOnCommit = false;

  @Column(name = "`interval`")
  private Long interval;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "last_update")
  private Long lastUpdate;

  @Lob
  @Column(name = "last_error")
  private String lastError;

}