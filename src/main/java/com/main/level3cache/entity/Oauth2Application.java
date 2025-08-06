package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Setter
@Entity
@Table(name = "oauth2_application")
public class Oauth2Application {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "uid")
  private Long uid;

  @Column(name = "name")
  private String name;

  @Column(name = "client_id")
  private String clientId;

  @Column(name = "client_secret")
  private String clientSecret;

  @ColumnDefault("1")
  @Column(name = "confidential_client", nullable = false)
  private Boolean confidentialClient = false;

  @Lob
  @Column(name = "redirect_uris")
  private String redirectUris;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

}