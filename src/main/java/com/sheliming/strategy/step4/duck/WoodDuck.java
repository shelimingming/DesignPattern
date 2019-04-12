package com.sheliming.strategy.step4.duck;

import com.sheliming.strategy.step4.capablity.FlyNoWay;
import com.sheliming.strategy.step4.capablity.QuackNoNoise;

//木头鸭不会飞也不会叫
public class WoodDuck extends Duck {
    public WoodDuck() {
        this.flyable = new FlyNoWay();
        this.quackable = new QuackNoNoise();
    }

    @Override
    public void display() {
        System.out.println("我是木头鸭");
    }

}
