package com.spring.constructorInjection;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String personName;
    private int personId;
    private Certificate certificate;
    private List<String> cources;

    @Override
    public String toString(){
        return this.personId + " : "+   this.personName + " { "+this.certificate +" } "+ this.cources ;
    }



}
