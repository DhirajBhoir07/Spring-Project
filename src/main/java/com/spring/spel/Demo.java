package com.spring.spel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString

@Component  // if i don't use it, i will get -> NoSuchBeanDefinitionException
public class Demo {

    @Value("#{2+4+6}")
    private int x ;

    @Value("#{12/2}")
    private int y ;


//  Calling Static method to make expression which returns the double value

//     SYNTAX   " #{ T(className).methodName(param) }"
    @Value("#{ T(java.lang.Math).sqrt(25) }")
    private double squreRoot;

//     SYNTAX   " #{ T(className).variable }"
    @Value("#{ T(java.lang.Math).PI }")
    private double pi;

//    How to insert object
    @Value("#{ new java.lang.String(' Hello Dhiraj') }")
    private String massage;

//   Booelan value
    @Value("#{ 3>2 }")
    private boolean isGreater;


}
