package com.sheliming.decorator;

public class Coffee extends Drink {

    public Coffee() {
        this.description = "coffee";
    }

    @Override
    public float cost() {
        return 12;
    }

}
