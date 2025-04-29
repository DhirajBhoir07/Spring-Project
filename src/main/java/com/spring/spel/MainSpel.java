package com.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

// class used - Demo

public class MainSpel {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel.xml");

        Demo d = context.getBean("demo",Demo.class);

        System.out.println("Value of d : "+d);
        System.out.println("============================");

        SpelExpressionParser s = new SpelExpressionParser();
        Expression e  = s.parseExpression("23+2");

//        System.out.println("getting value from Expression "+e.getValue());

    }

    /*  we can use SPEL in two way by @Value("#{expression}") and
    *   by using SpelExpressionParser class to get Expression
    *   and then use the getValue() method to get value.
    *   mostly we don't use this classes we can work with annotation
    *
    * It is a powerful expression language that allows you to query and
    *  manipulate objects at runtime inside a Spring application.

    * Where is SpEL used in Spring?
        @Value annotation to inject values
        Spring Security to define access expressions
        Spring Data JPA to write dynamic queries
        Spring Bean Configuration (XML/Java Config)
        Conditional bean initialization (@Conditional)

     * Syntax of SpEL
        SpEL expressions are typically written inside #{} or ${}.
        #{} → Used for SpEL (calculations, object references, method calls)
        ${} → Used for property placeholders (application.properties)

    * examples - #{age > 18 ? 'Adult' : 'Minor'}
                 #{myList[0]}   - Accessing the zeroth index value
                 #{employee?.manager?.name} -  Null-safe property access

     */
}
