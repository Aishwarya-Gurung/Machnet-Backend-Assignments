package com.example.springbootassignment1.task4;

public class Address {
    private String address;

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
    public void check(){
        System.out.println("Getting address using autowire: "+getAddress());
    }
}
