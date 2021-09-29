package com.example.springbootassignment1.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("beans.xml");
        Student s1= ctx.getBean("student1", Student.class);
        System.out.println(s1);
    }
}
