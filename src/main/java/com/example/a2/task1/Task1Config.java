package com.example.a2.task1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Task1Config {
    @Bean
    public Calculator getAirthematics(){
        return new Calculator();
    }
}
