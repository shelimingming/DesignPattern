package com.sheliming.decorator;

public class Test {
    public static void main(String[] args) {
        Drink d = new Milk();
        System.out.println(d.getDescription() + ":" + d.cost());

        d = new Sugar(d);
        System.out.println(d.getDescription() + ":" + d.cost());

        d = new Chocolate(d);
        System.out.println(d.getDescription() + ":" + d.cost());

    }
}
