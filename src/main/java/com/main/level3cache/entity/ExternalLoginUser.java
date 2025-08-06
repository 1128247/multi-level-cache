package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "external_login_user")
public class ExternalLoginUser {
  @EmbeddedId
  private ExternalLoginUserId id;

  @Column(name = "user_id", nullable = false)
  private Long userId;

  @Lob
  @Column(name = "raw_data")
  private String rawData;

  @Column(name = "provider", length = 25)
  private String provider;

  @Column(name = "email")
  private String email;

  @Column(name = "name")
  private String name;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "nick_name")
  private String nickName;

  @Column(name = "description")
  private String description;

  @Lob
  @Column(name = "avatar_url")
  private String avatarUrl;

  @Column(name = "location")
  private String location;

  @Lob
  @Column(name = "access_token")
  private String accessToken;

  @Lob
  @Column(name = "access_token_secret")
  private String accessTokenSecret;

  @Lob
  @Column(name = "refresh_token")
  private String refreshToken;

  @Column(name = "expires_at")
  private Instant expiresAt;

}