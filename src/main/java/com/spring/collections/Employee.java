package com.spring.collections;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private String empName;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String ,String> cources;
    private Properties properties;


}
