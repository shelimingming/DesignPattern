package com.sheliming.strategy.step3.Duck;

import com.sheliming.strategy.step3.capability.Quackable;

public class RubberDuck extends Duck implements Quackable {

    public void quack() {
        System.out.println("吱吱叫。。。");
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }
}
