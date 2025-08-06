package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "mirror")
public class Mirror {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "`interval`")
  private Long interval;

  @ColumnDefault("1")
  @Column(name = "enable_prune", nullable = false)
  private Boolean enablePrune = false;

  @Column(name = "updated_unix")
  private Long updatedUnix;

  @Column(name = "next_update_unix")
  private Long nextUpdateUnix;

  @ColumnDefault("0")
  @Column(name = "lfs_enabled", nullable = false)
  private Boolean lfsEnabled = false;

  @Lob
  @Column(name = "lfs_endpoint")
  private String lfsEndpoint;

}