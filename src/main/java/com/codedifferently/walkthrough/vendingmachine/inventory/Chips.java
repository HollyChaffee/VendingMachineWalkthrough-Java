package com.codedifferently.walkthrough.vendingmachine.inventory;

public class Chips extends Product {

    public Chips(String name, Double price){
        super(name, price);
        msg = "Munch Munch, Yum!";
    }

    @Override
    public String message() {
        return msg;
    }
}
