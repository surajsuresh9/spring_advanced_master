package com.autowiring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotation_config.xml");
        Employee e1 = (Employee) ac.getBean("emp");
        System.out.println(e1);
    }

}
