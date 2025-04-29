package com.spring.spel;


import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@ToString
@Getter
@Component
public class Company {

    @Value("#{emp.name}")
    private String empName;

    @Value("#{emp.salary * 2}")
    private int doubleSalary;

    @Value("#{emp.salary > 6000 ? 'High Salary' : 'Low Salary'}")
    private String salaryCategory;

    @Value("#{emp.skills[0]}")  // Accessing only first skill
    private String skill;

    @Value("#{emp.skills}")     // Accessing all skills
    private List<String> skills;


    /* Company and Employee are both configure are xml using @Component
    *  and Component-Scan it will search the classes and creates its beans
    *  So That's how we are using Employee class .
    * HERE I AM USING 'emp' name of bean which is declare in @Component("emp")*/

}