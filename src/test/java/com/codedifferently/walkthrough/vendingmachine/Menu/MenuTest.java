package com.codedifferently.walkthrough.vendingmachine.Menu;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MenuTest {
    @Test
    public void getOptionsTest() {
        //Given
        ArrayList<String> options = new ArrayList<>();
        options.add("WuTang");
        Menu menu = new Menu(options);
        //When
        int expected = 1;
        ArrayList<String> actualList = menu.getOptions();
        int actual = actualList.size();
        //Then
        Assert.assertEquals(expected, actual);

    }
}

