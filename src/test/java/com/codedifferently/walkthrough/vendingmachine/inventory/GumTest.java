package com.codedifferently.walkthrough.vendingmachine.inventory; ////Code Differently package-organizes a set of
// related classes and interfaces.

import org.junit.Assert; //Imports the Assert Class from the org.junit package or folder-provides a set of
// assertion methods useful for writing tests. Only failed assertions are recorded.
import org.junit.Test; //Imported from the org.junit package or folder-allows for the @Test
// annotation to be used in the program.

public class GumTest { //This is a public (accessed) class named GumTest

    @Test //An annotation provided by JUnit called @Test that tells the JUnit that the public void method in which it is
    // used can run as a test case
    public void constructorTest(){ //A test method called constructorTest created to call on the Gum Class.
        // Given
        String name = "Pur Gum"; //Name referencing a type String setting it to the string "Pur Gum"
        Double price = 1.50;
        Gum gumRef = new Gum(name, price); //gumRef is referencing type Gum, pointing to the new gum object.
        // The new operator is followed by a call to the constructor, which initializes the new object of Gum.

        // When
        String expected = "Pur Gum 1.50";
        String actual = gumRef.toString();
        // Then
        Assert.assertEquals("Constructor test",expected, actual); //Asserts that two objects are equal.
        // assertEquals method checks if two objects are equal or not. Also naming the test here to specify which test
        //either fails or passes.
    }

    @Test //An annotation provided by JUnit called @Test that tells the JUnit that the public void method in which it is
    // used can run as a test case
    public void messageTest(){ //A test method called messageTest created to call on the Gum Class.
        //Given
        Gum gumRef = new Gum(); ////gumRef is referencing type Gum, pointing to the new gum object.
        // The new operator is followed by a call to the constructor, which initializes the new object of Gum.

        // When
        String expected = "Chew Chew, Yum!";
        String actual = gumRef.message();

        // Then

        Assert.assertEquals("Message test", expected, actual); //Asserts that two objects are equal.
        // assertEquals method checks if two objects are equal or not. Also naming the test here to specify which test
        //either fails or passes.
    }
}
