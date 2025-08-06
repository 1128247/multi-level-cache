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
@Table(name = "package_cleanup_rule")
public class PackageCleanupRule {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @ColumnDefault("0")
  @Column(name = "enabled", nullable = false)
  private Boolean enabled = false;

  @ColumnDefault("0")
  @Column(name = "owner_id", nullable = false)
  private Long ownerId;

  @Column(name = "type", nullable = false)
  private String type;

  @ColumnDefault("0")
  @Column(name = "keep_count", nullable = false)
  private Integer keepCount;

  @ColumnDefault("''")
  @Column(name = "keep_pattern", nullable = false)
  private String keepPattern;

  @ColumnDefault("0")
  @Column(name = "remove_days", nullable = false)
  private Integer removeDays;

  @ColumnDefault("''")
  @Column(name = "remove_pattern", nullable = false)
  private String removePattern;

  @ColumnDefault("0")
  @Column(name = "match_full_name", nullable = false)
  private Boolean matchFullName = false;

  @ColumnDefault("0")
  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

  @ColumnDefault("0")
  @Column(name = "updated_unix", nullable = false)
  private Long updatedUnix;

}