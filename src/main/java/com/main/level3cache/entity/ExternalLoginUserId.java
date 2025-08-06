package com.main.level3cache.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ExternalLoginUserId implements Serializable {
  private static final long serialVersionUID = -609773814360417337L;
  @Column(name = "external_id", nullable = false)
  private String externalId;

  @Column(name = "login_source_id", nullable = false)
  private Long loginSourceId;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    ExternalLoginUserId entity = (ExternalLoginUserId) o;
    return Objects.equals(this.loginSourceId, entity.loginSourceId) &&
        Objects.equals(this.externalId, entity.externalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loginSourceId, externalId);
  }

}