package com.spring.standAloneColl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneMain {

    public static void main(String[] args) {
       ApplicationContext context =new ClassPathXmlApplicationContext("standAloneColl.xml");


        Person personMap = context.getBean("mapPerson",Person.class);
//        System.out.println("PersonMap List : "+ personMap);

        Players pl = context.getBean("playersInfo",Players.class);
        System.out.println("players : "+ pl);

    }

}
