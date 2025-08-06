package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_setting")
public class UserSetting {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "setting_key")
  private String settingKey;

  @Lob
  @Column(name = "setting_value")
  private String settingValue;

}