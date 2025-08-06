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
@Table(name = "upload")
public class Upload {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uuid", length = 40)
  private String uuid;

  @Column(name = "name")
  private String name;

}