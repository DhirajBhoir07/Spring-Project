package com.springAnnotation.javaConfig.practice;

import org.springframework.context.annotation.Bean;

public class JavaConfigPractice {

    @Bean
    public Chair getChair(){
        return  new Chair();
    }

    @Bean(name = {"hosiii","houseee"})
    public House houseBeanMethod(){
        return new House(getChair());
    }

}
