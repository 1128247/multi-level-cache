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
@Table(name = "tracked_time")
public class TrackedTime {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "issue_id")
  private Long issueId;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "time", nullable = false)
  private Long time;

  @ColumnDefault("0")
  @Column(name = "deleted", nullable = false)
  private Boolean deleted = false;

}