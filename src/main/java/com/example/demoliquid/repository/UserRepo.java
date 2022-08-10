package com.example.demoliquid.repository;

import com.example.demoliquid.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
  User findByUserName(String name);
  User findUserById(int id);
}
