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
@Table(name = "package")
public class Package {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "owner_id", nullable = false)
  private Long ownerId;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "type", nullable = false)
  private String type;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "lower_name", nullable = false)
  private String lowerName;

  @ColumnDefault("0")
  @Column(name = "semver_compatible", nullable = false)
  private Boolean semverCompatible = false;

  @ColumnDefault("0")
  @Column(name = "is_internal", nullable = false)
  private Boolean isInternal = false;

}