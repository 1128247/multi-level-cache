package com.main.level3cache.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class RepoTopicId implements Serializable {
  private static final long serialVersionUID = -835124558975807228L;
  @Column(name = "repo_id", nullable = false)
  private Long repoId;

  @Column(name = "topic_id", nullable = false)
  private Long topicId;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    RepoTopicId entity = (RepoTopicId) o;
    return Objects.equals(this.repoId, entity.repoId) &&
        Objects.equals(this.topicId, entity.topicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId, topicId);
  }

}