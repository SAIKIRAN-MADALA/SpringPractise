package com.example.springpractise.service;

import com.example.springpractise.entity.EmployeeEntity;
import com.example.springpractise.model.Employee;
import com.example.springpractise.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EmployeeV2ServiceImpl implements EmployeeService {
    /**
     * @param employee
     * @return
     */
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee save(Employee employee) {
        if (employee.getEmployee_id() == null || employee.getEmployeeEmail() == null) {
            employee.setEmployee_id(UUID.randomUUID().toString());
        }

        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, entity);
        employeeRepository.save(entity);

        return employee;
    }

    /**
     * @return
     */
    @Override
    public List<Employee> getAllEmployes() {
        List<EmployeeEntity> employeeEntityList =
                employeeRepository.findAll();
        List<Employee> employees =
                employeeEntityList
                        .stream()
                        .map( (employeeEntity) -> {
                            Employee employee= new Employee();
                            BeanUtils.copyProperties(employeeEntity,employee);
                            return employee;
                        } ).toList();
                ;
        return employees;
    }

    /**
     * @param Id
     * @return
     */
    @Override
    public Employee getEmployeeById(String Id) {
        Optional<EmployeeEntity> employeeEntity = Optional.of(employeeRepository.findById(Id).get());
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity, employee);
        return employee;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public String deleteEmployeeById(String id) {
        employeeRepository.deleteById(id);
        return "Requested data is deleted: "+id;
    }
}
