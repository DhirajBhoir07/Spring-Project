package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// ref , collection (list , set , map , prop), using p schema
// standalone collection , lifecycle of bean , constructor injection (ambiguity) index type
// scopetype (singlton, prototype) , stereotype(annotaions component scan )
// spel , autowiring
public class PracticeMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("practice.xml");

        Employee e = context.getBean("Emp",Employee.class);
        Employee e2 = context.getBean("Emp",Employee.class);
        System.out.println(e);

        System.out.println(e.hashCode());
        System.out.println(e2.hashCode());

    }
}
