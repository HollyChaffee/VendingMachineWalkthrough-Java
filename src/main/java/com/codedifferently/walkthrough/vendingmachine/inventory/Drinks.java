package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Drinks extends Product{

    public Drinks(String name, Double price) {
        super(name, price);
        msg = "Glug Glug, Yum!";
    }


    @Override
    public String message() {
        return msg;
    }
}
