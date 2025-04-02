package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeMain {
    public static void main(String[] args) {

        ApplicationContext context =  new ClassPathXmlApplicationContext("stereoType.xml");

        Student student = context.getBean("ob", Student.class);
        System.out.println("student : "+ student);

    }
}
