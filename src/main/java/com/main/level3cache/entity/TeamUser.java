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
@Table(name = "team_user")
public class TeamUser {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "org_id")
  private Long orgId;

  @Column(name = "team_id")
  private Long teamId;

  @Column(name = "uid")
  private Long uid;

}