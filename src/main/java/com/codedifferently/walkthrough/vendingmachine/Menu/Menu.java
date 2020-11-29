package com.codedifferently.walkthrough.vendingmachine.Menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> options;
    public Menu(ArrayList<String> optionsIn){
        this.options = optionsIn;

    }

    public ArrayList<String> getOptions() {
        return options;
    }
}
