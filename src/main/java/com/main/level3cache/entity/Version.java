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
@Table(name = "version")
public class Version {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "version")
  private Long version;

}