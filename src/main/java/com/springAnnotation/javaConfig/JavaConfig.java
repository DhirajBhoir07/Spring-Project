package com.springAnnotation.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*
   Why use @Configuration?
        Java-based configuration: Before Spring 3, XML was heavily used for configuration (applicationContext.xml). @Configuration allows pure Java configuration — no XML needed.
        Type-safety and refactoring: Java code is type-checked at compile time, unlike XML.
        Centralize bean creation logic: It's easier to organize and maintain.

   What is @ComponentScan
        Purpose: Tells Spring where to scan for annotated components
        Usage: Use it when you need to define a single base package or a few packages in one annotation.
        THAT'S HOW WE CAN DEFINE MULTIPLE PACKAGES IN THE ARRAY FORM.
    @ComponentScan(basePackages = {
    "com.example.service",
    "com.example.repository",
    "com.example.controller"
    })

*/



@Configuration
@ComponentScan(basePackages = "com.springAnnotation.javaConfig")
public class JavaConfig {

    @Bean
    public Student getStudent(){
        Student s = new Student();
        return  s;
    }

    /*
    * Normally, you use a single @ComponentScan with multiple packages when all packages should be
      scanned the same way — same filters, same naming strategy, etc. However,
    * if you need different scanning behavior for different packages
      (e.g., apply filters only to one, use a different naming strategy for another), that’s when you use @ComponentScans.


    */

}
