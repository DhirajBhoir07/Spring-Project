package com.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spel.xml");

        Company comp =context.getBean("company", Company.class);
        System.out.println("Comp : "+comp);


    }
}
