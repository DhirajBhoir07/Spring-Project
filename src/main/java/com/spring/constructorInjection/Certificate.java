package com.spring.constructorInjection;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Certificate {

    private String name;

    @Override
    public String toString(){
        return this.name;
    }
}
