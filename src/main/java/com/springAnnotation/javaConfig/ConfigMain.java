package com.springAnnotation.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

//      When we are using @Component on Student and not creating @Bean
//        Student s = context.getBean("student",Student.class);
//        System.out.println(s.hashCode());
//        s.study();

//        --> while using @Bean annotation
        Student s = context.getBean("stud",Student.class);
//        System.out.println(s.hashCode());
//        s.study();


//        --- practice
        Teacher tech = context.getBean("getTeacher",Teacher.class);
        tech.teachBooks();

    }

    /* When we remove xml configuration and use the pure java, that time we use "AnnotationConfigApplicationContext"
    *  and provide the configuration java class here "JavaConfig" annotated with @Configuration and @ComponentScan
    *  In that we provide the basepackage = ""
    *
    * What bean name Created when we Use bean tag on method ???
    *   What ever the method name that method name will be the bean name ( ex. getStudent )
    *
    * What happen if i don't provide the "JavaConfig.class" argument ???
    *   we will get " java.lang.IllegalStateException" saying -> AnnotationConfigApplicationContext@5a10411 has not been refreshed yet
    *
    *
    * */

}
