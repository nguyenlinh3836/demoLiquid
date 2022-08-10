package com.example.demoliquid.controller;

import com.example.demoliquid.model.entities.User;
import com.example.demoliquid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<?> listUser() {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.getAllUser());
  }

  @PostMapping("/{id}")
  public ResponseEntity<?> createUser(@RequestBody User user, @PathVariable int id) {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.createUser(user, id));
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> updateUser(@RequestBody User user, @PathVariable int id) {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.updateUser(user, id));
  }
}
