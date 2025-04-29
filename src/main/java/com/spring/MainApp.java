package com.spring;

import com.spring.collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Working On Spring ");

        /* If You are taking file from the any other package then give proper name
        * eg. if we are taken it from "com.spring" package then name should be "com/spring/config.xml"
        * if there are more than one file just use the ("name1","name2") */

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml","service.xml");
//        Student s = (Student) context.getBean("Student1");
//        System.out.println(s);
//        Student s2 = (Student) context.getBean("Student2");
//        System.out.println(s2);
//        Student s3 = (Student) context.getBean("Student3");
//        System.out.println(s3);

        System.out.println("-----------------------------");
//        Employee e = (Employee)context.getBean("emp10");
        Employee e = (Employee)context.getBean("Emploo");
        System.out.println(e);
        System.out.println("Cources : "+e.getCources());
        System.out.println("Phone no : "+e.getPhones());
        System.out.println("Properties : "+e.getProperties());

    }

    /*
    * When i check the Durgesh he created the xml file in the java folder but i am getting FileNotFoundException
    * so i Checked the issue and move the config file to "Resources" folder working fine ✅
    */


}
