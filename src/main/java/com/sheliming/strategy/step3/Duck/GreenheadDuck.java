package com.sheliming.strategy.step3.Duck;

import com.sheliming.strategy.step3.capability.Flyable;
import com.sheliming.strategy.step3.capability.Quackable;

public class GreenheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }

    public void fly() {
        System.out.println("鸭子飞起来了。。。");
    }

    public void quack() {
        System.out.println("鸭子嘎嘎叫。。。");
    }
}
