package com.example.demoliquid.controller;

import com.example.demoliquid.model.entities.Department;
import com.example.demoliquid.service.DepartmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/depart")
public class DepartmentController {
  @Autowired
  private DepartmentService departmentService;
  @GetMapping
  public ResponseEntity<List<Department>> listDepart() {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(departmentService.getAllDepart());
  }

  @GetMapping("/{name}")
  public ResponseEntity<?> getDepartByName(@PathVariable("name") String name) {
    return ResponseEntity.status(HttpStatus.ACCEPTED)
        .body(departmentService.findByDepartName(name));
  }

  @PostMapping
  public ResponseEntity<?> createDepart(@RequestBody Department department) {
    return ResponseEntity.status(HttpStatus.ACCEPTED)
        .body(departmentService.createDepart(department));
  }

  @PutMapping("/{id}")
  public ResponseEntity<?> updateDepart(@RequestBody Department department,
      @PathVariable("id") int id) {
    return ResponseEntity.status(HttpStatus.ACCEPTED)
        .body(departmentService.updateDepart(department, id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<HttpStatus> deleteDepart(@PathVariable("id") int id) {
    departmentService.deleteDepart(id);
    return ResponseEntity.ok(HttpStatus.NO_CONTENT);
  }
}
