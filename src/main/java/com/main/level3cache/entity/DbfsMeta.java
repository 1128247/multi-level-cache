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
@Table(name = "dbfs_meta")
public class DbfsMeta {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "full_path", nullable = false, length = 500)
  private String fullPath;

  @Column(name = "block_size", nullable = false)
  private Long blockSize;

  @Column(name = "file_size", nullable = false)
  private Long fileSize;

  @Column(name = "create_timestamp", nullable = false)
  private Long createTimestamp;

  @Column(name = "modify_timestamp", nullable = false)
  private Long modifyTimestamp;

}