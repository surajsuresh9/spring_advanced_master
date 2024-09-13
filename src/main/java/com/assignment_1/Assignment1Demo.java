package com.assignment_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment1Demo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("assignment_1_config.xml");
        Customer customer = (Customer) ctx.getBean("c");
        System.out.println(customer);
    }
}
