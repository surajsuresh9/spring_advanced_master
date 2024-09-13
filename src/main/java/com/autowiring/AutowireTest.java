package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        Employee e1 = (Employee) ac.getBean("emp");
        System.out.println(e1);
    }

}
