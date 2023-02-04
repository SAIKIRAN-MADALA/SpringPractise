package com.example.springpractise.service;

import com.example.springpractise.model.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee save(Employee employee);

    List<Employee> getAllEmployes();

    Employee getEmployeeById(String Id);

    String deleteEmployeeById(String id);
}