package com.main.level3cache.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "package_blob")
public class PackageBlob {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @ColumnDefault("0")
  @Column(name = "size", nullable = false)
  private Long size;

  @Column(name = "hash_md5", nullable = false, length = 32)
  private String hashMd5;

  @Column(name = "hash_sha1", nullable = false, length = 40)
  private String hashSha1;

  @Column(name = "hash_sha256", nullable = false, length = 64)
  private String hashSha256;

  @Column(name = "hash_sha512", nullable = false, length = 128)
  private String hashSha512;

  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

}