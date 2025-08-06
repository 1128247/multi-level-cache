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
@Table(name = "user")
public class User {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "lower_name", nullable = false)
  private String lowerName;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "full_name")
  private String fullName;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "keep_email_private")
  private Boolean keepEmailPrivate;

  @ColumnDefault("'enabled'")
  @Column(name = "email_notifications_preference", nullable = false, length = 20)
  private String emailNotificationsPreference;

  @Column(name = "passwd", nullable = false)
  private String passwd;

  @ColumnDefault("'argon2'")
  @Column(name = "passwd_hash_algo", nullable = false)
  private String passwdHashAlgo;

  @ColumnDefault("0")
  @Column(name = "must_change_password", nullable = false)
  private Boolean mustChangePassword = false;

  @Column(name = "login_type")
  private Integer loginType;

  @ColumnDefault("0")
  @Column(name = "login_source", nullable = false)
  private Long loginSource;

  @Column(name = "login_name")
  private String loginName;

  @Column(name = "type")
  private Integer type;

  @Column(name = "location")
  private String location;

  @Column(name = "website")
  private String website;

  @Column(name = "rands", length = 32)
  private String rands;

  @Column(name = "salt", length = 32)
  private String salt;

  @Column(name = "language", length = 5)
  private String language;

  @Column(name = "description")
  private String description;

  @Column(name = "created_unix")
  private Long createdUnix;

  @Column(name = "updated_unix")
  private Long updatedUnix;

  @Column(name = "last_login_unix")
  private Long lastLoginUnix;

  @Column(name = "last_repo_visibility")
  private Boolean lastRepoVisibility;

  @ColumnDefault("-1")
  @Column(name = "max_repo_creation", nullable = false)
  private Integer maxRepoCreation;

  @Column(name = "is_active")
  private Boolean isActive;

  @Column(name = "is_admin")
  private Boolean isAdmin;

  @ColumnDefault("0")
  @Column(name = "is_restricted", nullable = false)
  private Boolean isRestricted = false;

  @Column(name = "allow_git_hook")
  private Boolean allowGitHook;

  @Column(name = "allow_import_local")
  private Boolean allowImportLocal;

  @ColumnDefault("1")
  @Column(name = "allow_create_organization")
  private Boolean allowCreateOrganization;

  @ColumnDefault("0")
  @Column(name = "prohibit_login", nullable = false)
  private Boolean prohibitLogin = false;

  @Column(name = "avatar", nullable = false, length = 2048)
  private String avatar;

  @Column(name = "avatar_email", nullable = false)
  private String avatarEmail;

  @Column(name = "use_custom_avatar")
  private Boolean useCustomAvatar;

  @Column(name = "num_followers")
  private Integer numFollowers;

  @ColumnDefault("0")
  @Column(name = "num_following", nullable = false)
  private Integer numFollowing;

  @Column(name = "num_stars")
  private Integer numStars;

  @Column(name = "num_repos")
  private Integer numRepos;

  @Column(name = "num_teams")
  private Integer numTeams;

  @Column(name = "num_members")
  private Integer numMembers;

  @ColumnDefault("0")
  @Column(name = "visibility", nullable = false)
  private Integer visibility;

  @ColumnDefault("0")
  @Column(name = "repo_admin_change_team_access", nullable = false)
  private Boolean repoAdminChangeTeamAccess = false;

  @ColumnDefault("''")
  @Column(name = "diff_view_style", nullable = false)
  private String diffViewStyle;

  @ColumnDefault("''")
  @Column(name = "theme", nullable = false)
  private String theme;

  @ColumnDefault("0")
  @Column(name = "keep_activity_private", nullable = false)
  private Boolean keepActivityPrivate = false;

}