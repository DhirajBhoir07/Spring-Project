package com.spring.scopeType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ScopeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scopeType.xml");

        Teacher t1 = context.getBean("teacher",Teacher.class);
        System.out.println("Hash code : "+t1.hashCode());

        Teacher t2 = context.getBean("teacher",Teacher.class);
        System.out.println("Hash code : "+t2.hashCode());
        System.out.println(t1);



    }
}
