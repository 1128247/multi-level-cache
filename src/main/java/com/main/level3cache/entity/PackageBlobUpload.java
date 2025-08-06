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
@Table(name = "package_blob_upload")
public class PackageBlobUpload {
  @Id
  @Column(name = "id", nullable = false)
  private String id;

  @ColumnDefault("0")
  @Column(name = "bytes_received", nullable = false)
  private Long bytesReceived;

  @Column(name = "hash_state_bytes")
  private byte[] hashStateBytes;

  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

  @Column(name = "updated_unix", nullable = false)
  private Long updatedUnix;

}