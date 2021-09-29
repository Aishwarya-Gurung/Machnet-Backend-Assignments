package com.example.springbootassignment1.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Student s= ctx.getBean("student7", Student.class);

        System.out.println(s);
    }
}
