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
@Table(name = "action_run_index")
public class ActionRunIndex {
  @Id
  @Column(name = "group_id", nullable = false)
  private Long id;

  @Column(name = "max_index")
  private Long maxIndex;

}