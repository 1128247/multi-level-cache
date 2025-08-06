package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "gpg_key")
public class GpgKey {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "owner_id", nullable = false)
  private Long ownerId;

  @Column(name = "key_id", nullable = false, length = 16)
  private String keyId;

  @Column(name = "primary_key_id", length = 16)
  private String primaryKeyId;

  @Lob
  @Column(name = "content", nullable = false)
  private String content;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "expired_unix")
  private Long expiredUnix;

  @Column(name = "added_unix")
  private Long addedUnix;

  @Lob
  @Column(name = "emails")
  private String emails;

  @ColumnDefault("0")
  @Column(name = "verified", nullable = false)
  private Boolean verified = false;

  @Column(name = "can_sign")
  private Boolean canSign;

  @Column(name = "can_encrypt_comms")
  private Boolean canEncryptComms;

  @Column(name = "can_encrypt_storage")
  private Boolean canEncryptStorage;

  @Column(name = "can_certify")
  private Boolean canCertify;

}