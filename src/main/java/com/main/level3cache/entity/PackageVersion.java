package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "package_version")
public class PackageVersion {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "package_id", nullable = false)
  private Long packageId;

  @ColumnDefault("0")
  @Column(name = "creator_id", nullable = false)
  private Long creatorId;

  @Column(name = "version", nullable = false)
  private String version;

  @Column(name = "lower_version", nullable = false)
  private String lowerVersion;

  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

  @ColumnDefault("0")
  @Column(name = "is_internal", nullable = false)
  private Boolean isInternal = false;

  @Lob
  @Column(name = "metadata_json")
  private String metadataJson;

  @ColumnDefault("0")
  @Column(name = "download_count", nullable = false)
  private Long downloadCount;

}