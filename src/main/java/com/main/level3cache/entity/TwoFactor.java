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
@Table(name = "two_factor")
public class TwoFactor {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uid")
  private Long uid;

  @Column(name = "secret")
  private String secret;

  @Column(name = "scratch_salt")
  private String scratchSalt;

  @Column(name = "scratch_hash")
  private String scratchHash;

  @Column(name = "last_used_passcode", length = 10)
  private String lastUsedPasscode;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}