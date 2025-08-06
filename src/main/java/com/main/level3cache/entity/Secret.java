package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "secret")
public class Secret {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "owner_id", nullable = false)
  private Long ownerId;

  @ColumnDefault("0")
  @Column(name = "repo_id", nullable = false)
  private Long repoId;

  @Column(name = "name", nullable = false)
  private String name;

  @Lob
  @Column(name = "data")
  private String data;

  @Column(name = "created_unix", nullable = false)
  private Long createdUnix;

}