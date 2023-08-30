package com.chfour_videotwo_beginning.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
public class UserController {

  private final String API_URL = "https://jsonplaceholder.typicode.com/users";

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/fetch")
  public User[] fetchUsers() {
    return restTemplate.getForObject(API_URL, User[].class);
  }
}
