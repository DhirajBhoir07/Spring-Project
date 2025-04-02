package com.spring.standAloneColl;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class Person {

    private List<String> names;
    private Map<String , Integer> feesStructure;

}
