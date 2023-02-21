package com.example.springpractise.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String employee_id;
    private String firstName;
    private String lastName;
    private String employeeEmail;
    private String employee_phone;
    private String department;
}
