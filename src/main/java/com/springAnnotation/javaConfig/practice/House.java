package com.springAnnotation.javaConfig.practice;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class House {

    private Chair chair;

    public void house(){
        System.out.println("House method Started..");
        chair.woodChair();
        System.out.println("House method ended..");

    }

}
