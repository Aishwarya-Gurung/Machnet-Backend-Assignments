package com.example.springbootassignment1.task4;

public class Student {
    private int id;
    private String name;
    private Address address;

    public Student(Address address) {
        this.address = address;
    }
    public Student(){}

    public int getStudentId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {

        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public void checking(){
        System.out.println("This is student method");
        address.check();
    }
}
