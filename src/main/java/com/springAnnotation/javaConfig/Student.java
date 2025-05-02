package com.springAnnotation.javaConfig;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component --> use with componentScan
@Getter
@AllArgsConstructor
public class Student {

    private Books books;

    public void study(){
        System.out.println("Student is reading a book..");
        books.display();
    }
}
