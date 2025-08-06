package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "system_setting")
public class SystemSetting {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "setting_key")
  private String settingKey;

  @Lob
  @Column(name = "setting_value")
  private String settingValue;

  @Column(name = "version")
  private Integer version;

  @Column(name = "created")
  private Long created;

  @Column(name = "updated")
  private Long updated;

}