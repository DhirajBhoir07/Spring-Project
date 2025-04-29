package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRef {
    public static void main(String[] args) {

        System.out.println("Main Ref Started..");
        ApplicationContext context = new ClassPathXmlApplicationContext("ref.xml");

        A bean = (A) context.getBean("Aref");

        System.out.println("value of X : "+bean.getX());
        System.out.println("value of Y : "+ bean.getOb().getY());
        System.out.println("value of name : "+ bean.getCObject().getName());

    }
}
