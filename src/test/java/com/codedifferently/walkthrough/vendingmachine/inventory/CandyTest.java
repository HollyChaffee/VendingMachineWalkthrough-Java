package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {

    @Test
    public void candyConstructorTest() {
        //Given
        String name = "Reese's Peanut Butter Cup";
        Double price = 0.88;
        Candy candy = new Candy(name, price);

        //When
        String expected = name + " " + price;

        String actual = candy.toString();

        //Then
        Assert.assertEquals("Candy constructor Test", expected, actual);
    }

    @Test
    public void candyMessageTest(){
        //Given
        String name = "Reese's Peanut Butter Cup";
        Double price = 0.88;
        Candy candy = new Candy(name, price);

        // When
        String expected = "Munch Munch, Yum!";
        String actual = candy.message();

        // Then

        Assert.assertEquals(expected, actual);


    }



}