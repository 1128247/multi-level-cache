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
@Table(name = "dbfs_data")
public class DbfsDatum {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "revision", nullable = false)
  private Long revision;

  @Column(name = "meta_id", nullable = false)
  private Long metaId;

  @Column(name = "blob_offset", nullable = false)
  private Long blobOffset;

  @Column(name = "blob_size", nullable = false)
  private Long blobSize;

  @Column(name = "blob_data", nullable = false)
  private byte[] blobData;

}