package com.example.demoliquid.service;

import com.example.demoliquid.model.entities.Department;
import com.example.demoliquid.repository.DepartmentRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentRepo departmentRepo;

  @Override
  public List<Department> getAllDepart() {
    return departmentRepo.findAll();
  }

  @Override
  public Department findByDepartName(String name) {
    return departmentRepo.findByDepartName(name);
  }

  @Override
  public Department createDepart(Department department) {
    return departmentRepo.save(department);
  }

  @Override
  public Department updateDepart(Department department, int id) {
    department.setId(id);
    return departmentRepo.save(department);
  }

  @Override
  public void deleteDepart(int id) {
    Department department = departmentRepo.findById(id);
    departmentRepo.delete(department);
  }
}
