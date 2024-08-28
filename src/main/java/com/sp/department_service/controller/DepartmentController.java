package com.sp.department_service.controller;

import com.sp.department_service.model.Department;
import com.sp.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api1/departments")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @PostMapping
    public Department saveDepartment(@RequestBody Department department)
    {
        return departmentService.saveDepartment(department);
    }
    @GetMapping("/{id}")
    public Department getDepartmentById(@PathVariable int id)
    {
        return departmentService.getDepartmentById(id);
    }

}
