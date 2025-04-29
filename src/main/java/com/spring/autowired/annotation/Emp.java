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



//    Autowiring using 'FIELD INJECTION'
//    @Autowired
    private Address address;
    private String empName;


//   Autowiring using 'SETTER METHOD'

//    @Autowired
//    @Qualifier("address")
    public void setAddress(Address address) {
        this.address = address;
        System.out.println("Setter injection : Address");
    }

//    @Autowired
    public void setEmpName(String empName){
        this.empName = empName;
        System.out.println("Setter Injection : empName");
    }



//    Autowiring using 'CONSTRUCTOR'
    @Autowired
    public Emp(Address address) {
        this.address = address;
        this.empName = empName;
        System.out.println("Constructor injection");

    }



}
