package com.main.level3cache.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "hook_task")
public class HookTask {
  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "hook_id")
  private Long hookId;

  @Column(name = "uuid")
  private String uuid;

  @Lob
  @Column(name = "payload_content")
  private String payloadContent;

  @Column(name = "event_type")
  private String eventType;

  @Column(name = "is_delivered")
  private Boolean isDelivered;

  @Column(name = "delivered")
  private Long delivered;

  @Column(name = "is_succeed")
  private Boolean isSucceed;

  @Lob
  @Column(name = "request_content")
  private String requestContent;

  @Lob
  @Column(name = "response_content")
  private String responseContent;

}