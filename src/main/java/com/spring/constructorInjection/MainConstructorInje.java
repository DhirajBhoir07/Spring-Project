package com.spring.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainConstructorInje {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorInje.xml");
         Person p = (Person) context.getBean("person1");
        System.out.println(p);

//        AmbiguityInCalling add = (AmbiguityInCalling) context.getBean("addition");
//        add.sum();

    }
}
