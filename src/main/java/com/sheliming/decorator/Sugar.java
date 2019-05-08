package com.sheliming.decorator;

public class Sugar extends Drink {

    private Drink drink;

    public Sugar(Drink d) {
        this.drink = d;
    }

    public String getDescription() {
        return drink.getDescription() + "+sugar";
    }

    @Override
    public float cost() {
        return drink.cost() + 2;
    }

}