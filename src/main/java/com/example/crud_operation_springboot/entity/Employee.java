package com.example.crud_operation_springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee_Table")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private int age;
}
