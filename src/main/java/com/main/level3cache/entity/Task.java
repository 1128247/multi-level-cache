package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "task")
public class Task {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "doer_id")
  private Long doerId;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "repo_id")
  private Long repoId;

  @Column(name = "type")
  private Integer type;

  @Column(name = "status")
  private Integer status;

  @Column(name = "start_time")
  private Long startTime;

  @Column(name = "end_time")
  private Long endTime;

  @Lob
  @Column(name = "payload_content")
  private String payloadContent;

  @Lob
  @Column(name = "message")
  private String message;

  @Column(name = "created")
  private Long created;

}