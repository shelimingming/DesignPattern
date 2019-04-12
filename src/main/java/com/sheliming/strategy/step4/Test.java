package com.sheliming.strategy.step4;

import com.sheliming.strategy.step4.duck.Duck;
import com.sheliming.strategy.step4.duck.GreenheadDuck;
import com.sheliming.strategy.step4.duck.RubberDuck;
import com.sheliming.strategy.step4.duck.WoodDuck;

public class Test {
    public static void main(String[] args) {
        Duck greenheadDuck = new GreenheadDuck();
        greenheadDuck.display();
        greenheadDuck.performFly();
        greenheadDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        Duck woodDuck = new WoodDuck();
        woodDuck.display();
        woodDuck.performFly();
        woodDuck.performQuack();


    }
}
