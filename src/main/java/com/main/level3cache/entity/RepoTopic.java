package com.main.level3cache.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "repo_topic")
public class RepoTopic {
  @EmbeddedId
  private RepoTopicId id;

  //TODO [Reverse Engineering] generate columns from DB
}