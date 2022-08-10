package com.example.demoliquid.repository;

import com.example.demoliquid.model.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
  Department findByDepartName(String name);
  Department findById(int id);
}
