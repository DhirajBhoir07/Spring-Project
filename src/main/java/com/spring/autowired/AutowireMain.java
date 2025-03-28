package com.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {
    public static void main(String[] args) {

        System.out.println("----------- Started ---------");
        ApplicationContext context =new ClassPathXmlApplicationContext("autowiring.xml");
//        Emp e =context.getBean("Emp", Emp.class);
//        System.out.println("Employee Address : "+ e);

//        Emp e2 =context.getBean("Emp2", Emp.class);
//        System.out.println("Employee Address : "+ e2);


        Emp e3 = context.getBean("Emp3", Emp.class);
        System.out.println("Employee Address : "+ e3);

//      note - by using Emp.class we don't need to explicitly type caste into it.
    }
}
