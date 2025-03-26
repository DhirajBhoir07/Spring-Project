package com.spring.beanLifeCycle;


import lombok.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LifeCycleThroughInterface2 implements InitializingBean, DisposableBean {
    private String brand;
    private String name;
    private double price;

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method - Class name : LifeCycleThroughInterface2");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet (Init) - Class name : LifeCycleThroughInterface2");
    }

}
