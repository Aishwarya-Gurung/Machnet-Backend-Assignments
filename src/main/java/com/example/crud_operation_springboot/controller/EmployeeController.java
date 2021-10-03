package com.example.crud_operation_springboot.controller;

import com.example.crud_operation_springboot.entity.Employee;
import com.example.crud_operation_springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    //POST
    //Adding an Employee
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee emp) {

        return service.saveEmployee(emp);
    }
    //Adding list of Employees
    @PostMapping("/addEmployees")
    public List<Employee> addEmployees(@RequestBody List<Employee> emp) {

        return service.saveEmployees(emp);
    }

    // GET
    //Getting list of Employees
    @GetMapping("/Employees")
    public List<Employee> findAllEmployees() {

        return service.getEmployees();
    }

    //Getting Employee by id
    @GetMapping("/employeeById/{id}")
    public Employee findEmployeeById(@PathVariable int id) {

        return service.getEmployeeById(id);
    }

    //Getting Employee by name
    @GetMapping("/employeeByName/{name}")
    public Employee findEmployeeByName(@PathVariable String name) {

        return service.getEmployeeByName(name);
    }

    // PUT
    @PutMapping("/updateEmployeeData")
    public Employee updateProduct(@RequestBody Employee emp) {

        return service.updateEmployee(emp);
    }

    //DELETE
    @DeleteMapping("/deleteById/{id}")
    public String deleteEmployee(@PathVariable int id) {

        return service.deleteEmployee(id);
    }
}

