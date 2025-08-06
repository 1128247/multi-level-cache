package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "notice")
public class Notice {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "type")
  private Integer type;

  @Lob
  @Column(name = "description")
  private String description;

  @Column(name = "created_unix")
  private Long createdUnix;

}