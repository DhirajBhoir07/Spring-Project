package com.spring.stereotype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
//@Component  // it will create a bean name as class name using camelCase ex. Student = student
@Component("ob")
public class Student {

    @Value("Dhiraj")
    private String studentName;

    @Value("Shahapur")
    private String studentCity;

    @Value("#{subList}")
    private List<String> subjects;








    /* If don't provide the @Component then we will get
     NoSuchBeanDefinitionException: No bean named 'student' available*

    @Component is a core annotation in the Spring Framework that is used to mark a class
    as a Spring-managed bean. This means that Spring will automatically detect and register the class as
    a bean in the application context, making it available for dependency injection.


    How to Add list of values in @Value annotation
    - we add util schema in xml file
    - Declare the util list or set or map that uh added in the Bean type object
      here we have added List type so use <util-list> mention class and id
    - add values inside
    - use id name in @value with #{ }

    SpEl - Spring Expression Language - supports parssing and executing expression with the help
            of @Value annotation

     */
}
