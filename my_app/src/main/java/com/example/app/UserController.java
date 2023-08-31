package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/users")
public class UserController {

  private final String API_URL = "https://jsonplaceholder.typicode.com/users";

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/fetch")
  public User[] fetchUsers() throws Exception {
    String users = restTemplate.getForObject(API_URL, String.class);
    ObjectMapper objectMapper = new ObjectMapper();
    return objectMapper.readValue(users, User[].class);
  }
}