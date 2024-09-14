package com.injecting_interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectingInterfacesDemo {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("injecting_interfaces_config.xml");
        OrderBO orderBO = (OrderBO) ac.getBean("bo");
        orderBO.placeOrder();
    }
}
