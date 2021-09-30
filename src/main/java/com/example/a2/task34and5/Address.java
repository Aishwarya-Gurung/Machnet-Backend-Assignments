package com.example.a2.task34and5;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Address {
    @Value("${addressId}")
    private int addressId;
    @Value("${addressName}")
    private String addressName;

    public void checking(){
        System.out.println("The address id and name is" + " " + addressId + " " + addressName);
    }
}