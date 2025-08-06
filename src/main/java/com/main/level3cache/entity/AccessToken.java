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
@Table(name = "access_token")
public class AccessToken {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uid")
  private Long uid;

  @Column(name = "name")
  private String name;

  @Column(name = "token_hash")
  private String tokenHash;

  @Column(name = "token_salt")
  private String tokenSalt;

  @Column(name = "token_last_eight")
  private String tokenLastEight;

  @Column(name = "scope")
  private String scope;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}