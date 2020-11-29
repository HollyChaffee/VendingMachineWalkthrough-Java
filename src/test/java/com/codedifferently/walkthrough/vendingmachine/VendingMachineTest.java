package com.codedifferently.walkthrough.vendingmachine;

import com.codedifferently.walkthrough.vendingmachine.inventory.Candy;
import com.codedifferently.walkthrough.vendingmachine.inventory.Drinks;
import com.codedifferently.walkthrough.vendingmachine.inventory.Product;
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

        Product expectedBeverage = new Drinks("Hint Water Watermelon", 1.15);
        Map<String, Product> inventory = vendingMachine.getInventory();
        Product actualBeverage = inventory.get("A2");

        Assert.assertEquals(expectedDrinks.getName(), actualDrinks.getName());
    }



    public static void main(String[] args) {
        logger.info("Start");
    }
}
