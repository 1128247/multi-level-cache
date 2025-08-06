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
@Table(name = "user_open_id")
public class UserOpenId {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uid", nullable = false)
  private Long uid;

  @Column(name = "uri", nullable = false)
  private String uri;

  @ColumnDefault("0")
  @Column(name = "`show`")
  private Boolean show;

}