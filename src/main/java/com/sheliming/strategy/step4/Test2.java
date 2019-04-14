package com.sheliming.strategy.step4;

import com.sheliming.strategy.step4.capablity.FlyWithRocket;
import com.sheliming.strategy.step4.duck.Duck;
import com.sheliming.strategy.step4.duck.WoodDuck;

public class Test2 {
    public static void main(String[] args) {
        Duck woodDuck = new WoodDuck();
        woodDuck.display();
        woodDuck.performFly();

        woodDuck.setFlyable(new FlyWithRocket());
        woodDuck.performFly();
    }
}
