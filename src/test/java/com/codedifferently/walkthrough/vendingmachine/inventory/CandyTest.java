package com.codedifferently.walkthrough.vendingmachine.inventory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandyTest {

    @Test
    public void candyConstructorTest() {
        //Given
        String name = "Justin's Peanut Butter Cup";
        Double price = 1.95;
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
        String name = "Justin's Peanut Butter Cup";
        Double price = 1.95;
        Candy candy = new Candy(name, price);

        // When
        String expected = "Munch Munch, Yum!";
        String actual = candy.message();

        // Then

        Assert.assertEquals("Candy message test", expected, actual);


    }



}