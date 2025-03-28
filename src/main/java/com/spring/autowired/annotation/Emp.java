package com.spring.autowired.annotation;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Getter
//@Setter
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {

    /* We can use @Autowired on fields , setter and Constructor
    *  On that basis, dependecy get injected
    * Best Practice:
        Use constructor injection for required dependencies.
        Use setter injection for optional dependencies.
        Avoid field injection in production code because it makes testing harder. */


//    @Autowired
    private Address address;

    @Autowired
    @Qualifier("address")
    public void setAddress(Address address) {
        this.address = address;
        System.out.println("Setter injection");
    }

//    @Autowired
    public Emp(Address address) {
        this.address = address;
        System.out.println("Constructor injection");

    }



}
