package com.sp.department_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="department")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Department
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
