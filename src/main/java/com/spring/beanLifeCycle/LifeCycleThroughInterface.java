package com.spring.beanLifeCycle;

import lombok.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LifeCycleThroughInterface  implements InitializingBean, DisposableBean {
    String apple;


//    InitializingBean interface only gives this method to implement
//    It has only one method [ funtional interface ]
//   like init() method
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init - afterPropertiesSet,  class : LifeCycleThroughInterface");
    }

//    DisposableBean interface give this destory() method
//    it has only one method ,, [funtional interface]
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method from class : LifeCycleThroughInterface");
    }
}
