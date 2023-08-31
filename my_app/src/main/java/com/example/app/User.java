package com.example.app;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

  @JsonProperty("userId")
  private int id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("emailAddress")
  private String emailAddress;

  @JsonProperty("username")
  private String username;

  public int getUserId() {
    return id;
  }

  public void setUserId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return emailAddress;
  }

  public void setEmail(String email) {
    this.emailAddress = email;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
