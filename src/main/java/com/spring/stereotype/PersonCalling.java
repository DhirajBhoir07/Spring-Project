package com.spring.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersonCalling {

    @Value("Geeta")
    private String name;

    @Value("geeta@email")
    private String email;

    @Value("923342132")
    private int phoneNo;
}
