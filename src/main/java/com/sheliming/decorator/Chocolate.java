package com.sheliming.decorator;

public class Chocolate extends Drink {

    private Drink drink;

    public Chocolate(Drink d) {
        this.drink = d;
    }

    public String getDescription() {
        return drink.getDescription() + "+chocolate";
    }

    @Override
    public float cost() {
        return drink.cost() + 3;
    }
}
