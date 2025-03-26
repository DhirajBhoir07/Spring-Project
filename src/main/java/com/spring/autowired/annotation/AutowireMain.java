package com.spring.autowired.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
    public static void main(String[] args) {

        System.out.println("----------- Started ---------");
        ApplicationContext context =new ClassPathXmlApplicationContext("autowiringAnnotation.xml");
        Emp e =context.getBean("Emp1", Emp.class);
        System.out.println("Employee Address : "+ e);


    }
}
