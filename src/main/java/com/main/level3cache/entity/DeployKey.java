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
@Table(name = "deploy_key")
public class DeployKey {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "key_id")
  private Long keyId;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "name")
  private String name;

  @Column(name = "fingerprint")
  private String fingerprint;

  @ColumnDefault("1")
  @Column(name = "mode", nullable = false)
  private Integer mode;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}