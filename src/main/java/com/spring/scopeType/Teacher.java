package com.spring.scopeType;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Component
//@Scope("prototype")
public class Teacher {

    @Value("Arjit")
    private String teacherName;
}
