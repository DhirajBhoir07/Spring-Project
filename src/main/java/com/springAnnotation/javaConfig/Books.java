package com.springAnnotation.javaConfig;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Books {

    public void display(){
        System.out.println("book name - Lazy Boy");
    }

}
