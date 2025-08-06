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
@Table(name = "action_artifact")
public class ActionArtifact {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "run_id")
  private Long runId;

  @Column(name = "runner_id")
  private Long runnerId;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "commit_sha")
  private String commitSha;

  @Column(name = "storage_path")
  private String storagePath;

  @Column(name = "file_size")
  private Long fileSize;

  @Column(name = "file_compressed_size")
  private Long fileCompressedSize;

  @Column(name = "content_encoding")
  private String contentEncoding;

  @Column(name = "artifact_path")
  private String artifactPath;

  @Column(name = "artifact_name")
  private String artifactName;

  @Column(name = "status")
  private Long status;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}