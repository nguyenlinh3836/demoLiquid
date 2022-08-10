package com.example.demoliquid.service;

import com.example.demoliquid.model.entities.Department;
import java.util.List;

public interface DepartmentService {

  List<Department> getAllDepart();

  Department findByDepartName(String name);

  Department createDepart(Department department);

  Department updateDepart(Department department, int id);

  void deleteDepart(int id);
}
