package com.autowiring.annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
//
//    @Autowired
//    public Employee(Address address) {
//        this.address = address;
//    }

    @Autowired(required = true)
    @Qualifier("address123")
    private Address address;

//    public Address getAddress() {
//        return address;
//    }

//    public void setAddress(Address address) {
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Employee{" + "address=" + address + '}';
    }
}