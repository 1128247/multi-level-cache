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
@Table(name = "oauth2_authorization_code")
public class Oauth2AuthorizationCode {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "grant_id")
  private Long grantId;

  @Column(name = "code")
  private String code;

  @Column(name = "code_challenge")
  private String codeChallenge;

  @Column(name = "code_challenge_method")
  private String codeChallengeMethod;

  @Column(name = "redirect_uri")
  private String redirectUri;

  @Column(name = "valid_until")
  private Long validUntil;

}