package com.springAnnotation.javaConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("3")
    private int  id;

    public void study(){
        System.out.println("Student is reading a book..");
    }
}
