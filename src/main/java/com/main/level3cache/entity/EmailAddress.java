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
@Table(name = "email_address")
public class EmailAddress {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uid", nullable = false)
  private Long uid;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "lower_email", nullable = false)
  private String lowerEmail;

  @Column(name = "is_activated")
  private Boolean isActivated;

  @ColumnDefault("0")
  @Column(name = "is_primary", nullable = false)
  private Boolean isPrimary = false;

}