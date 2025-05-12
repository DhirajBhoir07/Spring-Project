package com.practice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
//Error creating bean with name 'Emp' defined in class path resource [practice.xml]:
// Failed to instantiate [com.practice.Employee]: No default constructor found
@NoArgsConstructor
@Scope("prototype")
@Component
public class Employee {

    private  int id;
    private String name;
    private Department department;


    public Employee(int id, String name, Department department) {
        System.out.println("Employee Constructor started...");
        this.id = id;
        this.name = name;
        this.department = department;
    }

}
