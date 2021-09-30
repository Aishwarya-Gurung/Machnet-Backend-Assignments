package com.example.a2.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[]args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(Task1Config.class);
        Calculator c = ctx.getBean("getAirthematics", Calculator.class);
        int answer = c.add(2, 3);
        int answer2 = c.subtract(3, 2);
        int answer3 = c.multiply(3, 2);
        double answer4 = c.divide(7, 2);
        System.out.println("The addition of two numbers is: " + answer);
        System.out.println("The subtraction of two numbers is: " + answer2);
        System.out.println("The multiplication of two numbers is: " + answer3);
        System.out.println("The division of two numbers is: " + answer4);
    }

}
