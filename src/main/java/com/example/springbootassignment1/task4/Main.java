package com.example.springbootassignment1.task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Student s=ctx.getBean("student",Student.class);
        s.checking();
        System.out.println(s);
    }
}
