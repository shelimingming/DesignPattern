package com.sheliming.strategy.step4.duck;

import com.sheliming.strategy.step4.capablity.Flyable;
import com.sheliming.strategy.step4.capablity.Quackable;

public abstract class Duck {

    protected Flyable flyable;

    protected Quackable quackable;

    public void swim() {
        System.out.println("鸭子游泳。。。");
    }

    public abstract void display();

    //调用Flyable来实现飞，代替fly方法
    public void performFly() {
        flyable.fly();
    }

    //调用Quackable来实现叫，代替quack方法
    public void performQuack() {
        quackable.quack();
    }

}

