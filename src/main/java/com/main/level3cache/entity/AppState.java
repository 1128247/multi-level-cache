package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "app_state")
public class AppState {
  @Id
  @Column(name = "id", nullable = false, length = 200)
  private String id;

  @Column(name = "revision")
  private Long revision;

  @Lob
  @Column(name = "content")
  private String content;

}