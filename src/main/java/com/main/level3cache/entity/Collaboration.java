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
@Table(name = "collaboration")
public class Collaboration {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "repo_id", nullable = false)
  private Long repoId;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @ColumnDefault("2")
  @Column(name = "mode", nullable = false)
  private Integer mode;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}