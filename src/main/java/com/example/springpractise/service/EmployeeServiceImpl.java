package com.example.springpractise.service;

import com.example.springpractise.exceptions.EmployeeNotFoundException;
import com.example.springpractise.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
    private static Logger logger= LoggerFactory.getLogger(EmployeeServiceImpl.class);
    List<Employee> employees = new ArrayList<>();

    @Override
    public Employee save(Employee employee) {

        if( employee.getEmployee_id() == null ||
                employee.getEmployeeEmail() == null )
        {
            employee.setEmployee_id(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployes() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees
                .stream()
                .filter(employee -> employee.getEmployee_id().equalsIgnoreCase(id))
                .findFirst()
                .   orElseThrow( ()-> new RuntimeException(""+"Employee Id Not Found: "+id)
                );
    }

    @Override
    public String deleteEmployeeById(String id) {
        Employee employee =
                employees
                .stream()
                .filter(emp -> emp.getEmployee_id().equalsIgnoreCase(id))
                .findFirst()
                .get();
        employees.remove(employee);
        return "Employee Deleted with Id" + id;
    }
}