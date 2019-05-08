package com.sheliming.decorator;

public class Milk extends Drink {

    public Milk() {
        this.description = "milk";
    }

    @Override
    public float cost() {
        return 10;
    }

}