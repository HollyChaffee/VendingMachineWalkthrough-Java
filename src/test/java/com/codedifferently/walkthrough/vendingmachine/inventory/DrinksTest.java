package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrinksTest {
    @Test
    public void drinksConstructorTest() {
        //Given
        String name = "Hint Water Watermelon";
        Double price = 1.15;
        Drinks drinks = new Drinks(name, price);

        //When
        String expected = name + " " + price;

        String actual = drinks.toString();

        //Then
        Assert.assertEquals("Drinks constructor Test", expected, actual);
    }

    @Test
    public void drinksMessageTest() {
        //Given
        String name = "Hint Water Watermelon";
        Double price = 1.15;
        Drinks drinks = new Drinks(name, price);

        // When
        String expected = "Glug Glug, Yum!";
        String actual = drinks.message();

        // Then

        Assert.assertEquals("Drinks message test", expected, actual);
    }

}

