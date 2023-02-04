package com.example.springpractise.controller;

import com.example.springpractise.model.Employee;
import com.example.springpractise.service.EmployeeService;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private static Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody @NotNull Employee employee) {
        logger.info(employee.getFirstName());
        return employeeService.save(employee);
    }

    @GetMapping
    public List<Employee> get_AllEmployee() {
        return employeeService.getAllEmployes();
    }

    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("{id}")
    public String deleteEmployeeById(@PathVariable String id) {
        return employeeService.deleteEmployeeById(id);
    }

}
