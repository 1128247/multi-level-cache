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
@Table(name = "team_invite")
public class TeamInvite {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @ColumnDefault("''")
  @Column(name = "token", nullable = false)
  private String token;

  @ColumnDefault("0")
  @Column(name = "inviter_id", nullable = false)
  private Long inviterId;

  @ColumnDefault("0")
  @Column(name = "org_id", nullable = false)
  private Long orgId;

  @ColumnDefault("0")
  @Column(name = "team_id", nullable = false)
  private Long teamId;

  @ColumnDefault("''")
  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}