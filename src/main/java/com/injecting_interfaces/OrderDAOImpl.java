package com.injecting_interfaces;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dao")
public class OrderDAOImpl implements OrderDAO {
    @Override
    public void createOrder() {
        System.out.println("Inside OrderDAOImpl createOrder");
    }
}
