package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "package_property")
public class PackageProperty {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "ref_type", nullable = false)
  private Long refType;

  @Column(name = "ref_id", nullable = false)
  private Long refId;

  @Column(name = "name", nullable = false)
  private String name;

  @Lob
  @Column(name = "value", nullable = false)
  private String value;

}