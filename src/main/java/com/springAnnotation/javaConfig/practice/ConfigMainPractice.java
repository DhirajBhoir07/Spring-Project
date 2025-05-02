package com.springAnnotation.javaConfig.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigMainPractice {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigPractice.class);

        House h = context.getBean("hosiii",House.class);
        h.house();
    }
}
