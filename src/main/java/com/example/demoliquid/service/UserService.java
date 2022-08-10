package com.example.demoliquid.service;

import com.example.demoliquid.model.entities.Department;
import com.example.demoliquid.model.entities.User;
import java.util.List;

public interface UserService {

  List<User> getAllUser();

  User createUser(User user, int department);

  User updateUser(User user, int id);

  void deleteUser(int id);

}
