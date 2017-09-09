package com.example.rodo.examen01.models;

import java.util.ArrayList;

/**
 * Created by rodo on 9/8/17.
 */

public class singleton {

    private static final singleton SELF = new singleton();

    private ArrayList<Customer> Customers = new ArrayList<Customer>();

    private singleton() {
    }
    public  ArrayList<Customer> getCustomers() {
        return Customers;
    }

    public static singleton getInstance() {
        return SELF;
    }
}
