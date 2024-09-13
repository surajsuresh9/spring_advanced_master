package com.assignment_1;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

    private String name;

    @Autowired(required = true)
    private Reservation reservation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", reservation=" + reservation + '}';
    }
}
