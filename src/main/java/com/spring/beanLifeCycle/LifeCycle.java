package com.spring.beanLifeCycle;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LifeCycle {
    private String  yourName;
    private List<String> branches;
    private Map<String,String> cities;
    private Bikes bike;

    public void init(){
        System.out.println("Started Init method");
    }

    public void destroy(){
        System.out.println("Started Destroy method");

    }
}
