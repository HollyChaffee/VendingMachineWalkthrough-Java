package com.codedifferently.walkthrough.vendingmachine.inventory; //Code Differently package-organizes a set of
// related classes and interfaces.

public class Gum extends Product{ //Publicly accessed class named Gum which extends (inherits) from the abstract
    // parent (also called super) class of Product.

    public Gum(String nameIn, Double priceIn){ //Constructor - block of code that is initializing the newly
        //created object of Gum, passing in two parameters(values)of types String and Double.
        super(nameIn, priceIn); //Calling on the super or parent Product class. The name and price values of
        //Object Gum are now assigned to the super.
        msg = "Chew Chew, Yum!"; //Message that is returned from parent Product class.
    }

    public Gum(){ //Default constructor of Object Gum with no arguments
        this("Peppermint Chew", 0.0); //Two default values are set here:
        // one for the name-"Rhino Chew" and one for the price-0.0
    }

    @Override //An annotation which overrides the functionality of an existing method.
    public String message() { //Method called message set to type String
        return msg; //Returns the input message
    }
}
