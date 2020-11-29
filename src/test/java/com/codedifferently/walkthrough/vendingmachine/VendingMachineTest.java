package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.inventory.*;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class VendingMachineTest {
    private final static Logger logger = Logger.getLogger(VendingMachineTest.class);


    @Test
    public void stockVendingMachineTest(){
        String[] sample = {"A1|Justin's Peanut Butter Cup|1.95|Candy"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        Product expectedCandy = new Candy("Justin's Peanut Butter Cup", 1.95);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualCandy = inventory.get("A1");

        Assert.assertEquals(expectedCandy.getName(), actualCandy.getName());
    }

    @Test
    public void stockVendingMachineTest2(){
        String[] sample = {"A2|Hint Water Watermelon|1.15|Drinks"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        Product expectedDrinks = new Drinks("Hint Water Watermelon", 1.15);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualDrinks = inventory.get("A2");

        Assert.assertEquals(expectedDrinks.getName(), actualDrinks.getName());
    }

    @Test
    public void stockVendingMachineTest3(){
        String[] sample = {"A3|Skinny Pop Sea Salt Chips|1.15|Chips"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        Product expectedChips = new Chips("Skinny Pop Sea Salt Chips", 1.80);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualChips = inventory.get("A3");

        Assert.assertEquals(expectedChips.getName(), actualChips.getName());
    }

    @Test
    public void stockVendingMachineTest4(){
        String[] sample = {"A4|Pur Gum|1.15|Gum"};
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.stockVendingMachine(sample);

        Product expectedGum = new Gum("Pur Gum", 1.50);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualGum = inventory.get("A4");

        Assert.assertEquals(expectedGum.getName(), actualGum.getName());
    }


    public static void main(String[] args) {
        logger.info("Start");
    }
}
