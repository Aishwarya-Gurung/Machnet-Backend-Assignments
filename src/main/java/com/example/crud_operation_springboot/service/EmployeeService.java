package com.example.crud_operation_springboot.service;

import com.example.crud_operation_springboot.entity.Employee;
import com.example.crud_operation_springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    //POST
    //Save an Employee
    public Employee saveEmployee(Employee emp) {

        return repository.save(emp);
    }

    //Save list of Employees
    public List<Employee> saveEmployees(List<Employee> emp) {
        return repository.saveAll(emp);
    }

    //GET
    //GET list of Employees
    public List<Employee> getEmployees() {

        return repository.findAll();
    }

    //GET Employee by id
    public Employee getEmployeeById(int id) {

        return repository.findById(id).orElse(null);
    }

    //GET Employees by name
    public Employee getEmployeeByName(String name) {

        return repository.findByName(name);
    }

    //PUT
    public Employee updateEmployee(Employee emp) {
        Employee existingEmployee = repository.findById(emp.getId()).orElse(null);
        existingEmployee.setName(emp.getName());
        existingEmployee.setAddress(emp.getAddress());
        existingEmployee.setAge(emp.getAge());
        return repository.save(existingEmployee);
    }

    //DELETE
    public String deleteEmployee(int id) {
        repository.deleteById(id);
        return "Employee of id" + " " + id + " " + "is deleted.";
    }
}
