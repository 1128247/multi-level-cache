package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "oauth2_grant")
public class Oauth2Grant {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "application_id")
  private Long applicationId;

  @ColumnDefault("1")
  @Column(name = "counter", nullable = false)
  private Long counter;

  @Lob
  @Column(name = "scope")
  private String scope;

  @Lob
  @Column(name = "nonce")
  private String nonce;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}