package com.spring.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLifeCyce {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        LifeCycle c = (LifeCycle) context.getBean("lifecycle");
//        System.out.println(c);

//      I have created new class and implement init method concept
//      through interface ( InitializingBean ) implementation.. and its method called afterProperitesSet()
        LifeCycleThroughInterface f = (LifeCycleThroughInterface) context.getBean("lifecycleInterface");
        System.out.println("apla apple : "+f.getApple());


        LifeCycleThroughInterface2 li = (LifeCycleThroughInterface2) context.getBean("lifecycleInterface2");
        System.out.println("practice interface 2 "+ li);


//      is used to ensure that the Spring ApplicationContext is gracefully shut down when the JVM terminates.
//      This is particularly useful for releasing resources, closing connections,
//      and calling @PreDestroy and destroy() methods on beans.
        context.registerShutdownHook();


    }
}
