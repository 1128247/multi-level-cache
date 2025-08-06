package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "gpg_key_import")
public class GpgKeyImport {
  @Id
  @Column(name = "key_id", nullable = false, length = 16)
  private String keyId;

  @Lob
  @Column(name = "content", nullable = false)
  private String content;

}