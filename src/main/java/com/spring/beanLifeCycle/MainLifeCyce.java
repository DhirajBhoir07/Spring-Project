package com.spring.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLifeCyce {
    public static void main(String[] args) {

/*
     AbstractApplicationContext is an abstract class provided by Spring that implements the
     ApplicationContext interface and provides common functionalities for all application context implementations.
     Why Use AbstractApplicationContext?
      AbstractApplicationContext provides useful methods like:
            registerShutdownHook() – Registers a shutdown hook with the JVM to ensure that the context is closed properly.
            getBean() – To retrieve beans from the context.
            refresh() – To reinitialize the context (can be used in custom extensions).
            close() – To close the context manually.*/
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");

        LifeCycle c =  context.getBean("lifecycle",LifeCycle.class);
        System.out.println(c);

//      I have created new class and implement init method concept
//      through interface ( InitializingBean ) implementation.. and its method called afterProperitesSet()
//        LifeCycleThroughInterface f = (LifeCycleThroughInterface) context.getBean("lifecycleInterface");
//        System.out.println("apla apple : "+f.getApple());
//
//
//        LifeCycleThroughInterface2 li = (LifeCycleThroughInterface2) context.getBean("lifecycleInterface2");
//        System.out.println("practice interface 2 "+ li);


//      registerShutdownHook : It is used to ensure that the Spring ApplicationContext is gracefully shut down when the JVM terminates.
//      This is particularly useful for releasing resources, closing connections,
//      and calling @PreDestroy and destroy() methods on beans.
        context.registerShutdownHook();


    }
}
