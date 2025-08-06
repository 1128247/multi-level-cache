package com.main.level3cache.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "session")
public class Session {
  @Id
  @Column(name = "`key`", nullable = false, length = 16)
  private String key;

  @Column(name = "data")
  private byte[] data;

  @Column(name = "expiry")
  private Long expiry;

}