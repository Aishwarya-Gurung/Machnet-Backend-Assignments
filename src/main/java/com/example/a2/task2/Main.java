package com.example.a2.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[]args) {
        ApplicationContext ctx =new AnnotationConfigApplicationContext(Task2Config.class);
        //singleton and prototype examples.
        Student s = ctx.getBean("student", Student.class);
        Student s1 = ctx.getBean("student", Student.class);

        if (s.hashCode()==s1.hashCode()){
            System.out.println("Object is same" + " " + "hashcode 1:" + " " + s.hashCode() + " " + "hashcode 2:" + " " + s1.hashCode());
        }else{
            System.out.println("Object is different" + " " + "hashcode 1:" + " " + s.hashCode() + " " + "hashcode 2:" + " " + s1.hashCode());
        }







    }
}
