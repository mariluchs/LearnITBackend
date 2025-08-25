package com.example.momolearn.model;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document("session_tokens")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class SessionToken {
  @Id
  private String id;

  @Indexed(unique = true)
  private String token;

  @Indexed
  private String userId;

  private Instant createdAt;
  private Instant expiresAt; // z.B. +7 Tage
}
