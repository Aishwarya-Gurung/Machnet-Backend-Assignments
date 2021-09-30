package com.example.a2.task34and5;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[]args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(Task3Config.class);
        Student s4 = ctx.getBean(Student.class);
        s4.check();
    }
}
