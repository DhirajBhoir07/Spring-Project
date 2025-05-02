package com.springAnnotation.javaConfig.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Chair {

    public void woodChair(){
        System.out.println("chair class method called");
    }
}
