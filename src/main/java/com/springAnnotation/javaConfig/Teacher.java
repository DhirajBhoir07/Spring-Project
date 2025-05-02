package com.springAnnotation.javaConfig;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Teacher {

    private Books techBook;

    public void teachBooks(){
        System.out.println("Teach Book method - ");
        techBook.display();
    }

}
