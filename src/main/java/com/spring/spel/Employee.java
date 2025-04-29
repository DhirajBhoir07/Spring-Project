package com.spring.spel;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Getter
@ToString
@Component("emp")
public class Employee {
    private String name = "John Doe";
    private int salary = 5000;
    private List<String> skills= Arrays.asList("java","python","C#");


}
