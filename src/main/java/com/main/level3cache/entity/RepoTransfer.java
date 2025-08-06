package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "repo_transfer")
public class RepoTransfer {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "doer_id")
  private Long doerId;

  @Column(name = "recipient_id")
  private Long recipientId;

  @Column(name = "repo_id")
  private Long repoId;

  @Lob
  @Column(name = "team_i_ds")
  private String teamIDs;

  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

  @Column(name = "updated_unix", nullable = false)
  private Long updatedUnix;

}