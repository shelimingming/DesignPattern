package com.sheliming.strategy.step4.capablity;

public class FlyNoWay implements Flyable{

    @Override
    public void fly() {
        System.out.println("鸭子不会飞。。。");
    }
}
