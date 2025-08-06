package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "login_source")
public class LoginSource {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "type")
  private Integer type;

  @Column(name = "name")
  private String name;

  @ColumnDefault("0")
  @Column(name = "is_active", nullable = false)
  private Boolean isActive = false;

  @ColumnDefault("0")
  @Column(name = "is_sync_enabled", nullable = false)
  private Boolean isSyncEnabled = false;

  @Lob
  @Column(name = "cfg")
  private String cfg;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}