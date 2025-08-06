package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "action_runner")
public class ActionRunner {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uuid", length = 36)
  private String uuid;

  @Column(name = "name")
  private String name;

  @Column(name = "version", length = 64)
  private String version;

  @Column(name = "owner_id")
  private Long ownerId;

  @Column(name = "repo_id")
  private Long repoId;

  @Lob
  @Column(name = "description")
  private String description;

  @Column(name = "base")
  private Integer base;

  @Column(name = "repo_range")
  private String repoRange;

  @Column(name = "token_hash")
  private String tokenHash;

  @Column(name = "token_salt")
  private String tokenSalt;

  @Column(name = "last_online")
  private Long lastOnline;

  @Column(name = "last_active")
  private Long lastActive;

  @Lob
  @Column(name = "agent_labels")
  private String agentLabels;

  @Lob
  @Column(name = "custom_labels")
  private String customLabels;

  @Column(name = "created")
  private Long created;

  @Column(name = "updated")
  private Long updated;

  @Column(name = "deleted")
  private Long deleted;

}