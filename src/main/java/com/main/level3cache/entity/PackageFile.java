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
@Table(name = "package_file")
public class PackageFile {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "version_id", nullable = false)
  private Long versionId;

  @Column(name = "blob_id", nullable = false)
  private Long blobId;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "lower_name", nullable = false)
  private String lowerName;

  @Column(name = "composite_key")
  private String compositeKey;

  @ColumnDefault("0")
  @Column(name = "is_lead", nullable = false)
  private Boolean isLead = false;

  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

}