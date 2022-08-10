package com.example.demoliquid.service;

import com.example.demoliquid.model.entities.Department;
import com.example.demoliquid.model.entities.User;
import com.example.demoliquid.repository.DepartmentRepo;
import com.example.demoliquid.repository.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
  @Autowired
  private UserRepo userRepo;
  @Autowired
  private DepartmentRepo departmentRepo;
  @Override
  public List<User> getAllUser() {
    return userRepo.findAll();
  }

  @Override
  public User createUser(User user, int department) {
    user.setDepartment(departmentRepo.findById(department));
    return userRepo.save(user);
  }

  @Override
  public User updateUser(User user, int id) {
    user.setId(id);
    return userRepo.save(user);
  }

  @Override
  public void deleteUser(int id) {
    User user = userRepo.findUserById(id);
    userRepo.delete(user);
  }
}
