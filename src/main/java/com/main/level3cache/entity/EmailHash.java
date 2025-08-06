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
@Table(name = "email_hash")
public class EmailHash {
  @Id
  @Column(name = "hash", nullable = false, length = 32)
  private String hash;

  @Column(name = "email", nullable = false)
  private String email;

}