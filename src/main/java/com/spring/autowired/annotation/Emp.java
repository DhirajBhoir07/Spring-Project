package com.spring.autowired.annotation;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Emp {

    @Autowired
    private Address address;

}
