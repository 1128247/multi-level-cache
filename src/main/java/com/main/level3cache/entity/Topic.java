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
@Table(name = "topic")
public class Topic {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", length = 50)
  private String name;

  @Column(name = "repo_count")
  private Integer repoCount;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}