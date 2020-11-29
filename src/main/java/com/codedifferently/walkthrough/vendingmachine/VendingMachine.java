package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.Menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private Scanner scan;
    public VendingMachine() {
        this.scan = new Scanner(System.in);
    }
    public void start(){
        System.out.println("Welcome to G Moneys Vending Machine");
        boolean flag = true;
        ArrayList<String> options = new ArrayList<>();
        options.add("(1) Display Vending Machine Items");
        options.add("(2) Purchase");
        options.add("(3) Exit");
        Menu menu = new Menu(options);
        while(flag) {

            for(String option : menu.getOptions()){
                System.out.println(option);
            }

            String input = scan.next();

            if (input.equals("3")) {
                flag = false;
                System.out.println("Goodbye");
            } else {
                System.out.println("Try again");
            }
        }
        scan.close();
    }
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.start();


    }
}
