package com.sp.department_service.service;

import com.sp.department_service.dao.DepartmentRepository;
import com.sp.department_service.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }


    public Department getDepartmentById(int departmentId) {
        return departmentRepository.findById(departmentId).get();
    }
}
