package com.practice;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    private int deptId;

    private String department;

    private List<String> teachersList;
    private Set<String> teachersList2;
    private Map<String,Integer> teachersList3;




}
