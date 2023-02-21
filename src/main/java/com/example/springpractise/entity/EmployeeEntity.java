package com.example.springpractise.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tbl_employee")
public class EmployeeEntity {
    @Id
    private String employee_id;
    private String firstName;
    private String lastName;
    private String employeeEmail;
    private String employee_phone;
    private String department;

}
