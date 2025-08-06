package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "public_key")
public class PublicKey {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "owner_id", nullable = false)
  private Long ownerId;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "fingerprint", nullable = false)
  private String fingerprint;

  @Lob
  @Column(name = "content", nullable = false)
  private String content;

  @ColumnDefault("2")
  @Column(name = "mode", nullable = false)
  private Integer mode;

  @ColumnDefault("1")
  @Column(name = "type", nullable = false)
  private Integer type;

  @ColumnDefault("0")
  @Column(name = "login_source_id", nullable = false)
  private Long loginSourceId;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

  @ColumnDefault("0")
  @Column(name = "verified", nullable = false)
  private Boolean verified = false;

}