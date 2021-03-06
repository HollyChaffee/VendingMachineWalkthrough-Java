package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChipsTest {
    @Test
    public void chipsConstructorTest() {
        //Given
        String name = "Skinny Pop Sea Salt Chips";
        Double price = 1.80;
        Chips chips = new Chips(name, price);

        //When
        String expected = name + " " + price;

        String actual = chips.toString();

        //Then
        Assert.assertEquals("Chips constructor Test", expected, actual);
    }

    @Test
    public void chipsMessageTest() {
        //Given
        String name = "Skinny Pop Sea Salt Chips";
        Double price = 1.80;
        Chips chips = new Chips(name, price);

        // When
        String expected = "Munch Munch, Yum!";
        String actual = chips.message();

        // Then

        Assert.assertEquals("Chips message test", expected, actual);
    }

    }