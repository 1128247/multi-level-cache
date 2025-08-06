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
@Table(name = "lfs_meta_object")
public class LfsMetaObject {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "oid", nullable = false)
  private String oid;

  @Column(name = "size", nullable = false)
  private Long size;

  @Column(name = "repository_id", nullable = false)
  private Long repositoryId;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}