package com.example.springpractise.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
@JsonIgnoreProperties({"department"})
public class Employee {

    private String employee_id;
    private String firstName;
    private String lastName;
    private String employeeEmail;
    private String employee_phone;
    private String department;
}
