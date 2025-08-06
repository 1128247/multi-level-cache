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
@Table(name = "stopwatch")
public class Stopwatch {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "issue_id")
  private Long issueId;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "created_unix")
  private Long createdUnix;

}