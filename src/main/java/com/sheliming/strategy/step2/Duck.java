package com.sheliming.strategy.step2;

public abstract class Duck {
    public void quack() {
        System.out.println("鸭子嘎嘎叫。。。");
    }

    public void swim() {
        System.out.println("鸭子游泳。。。");
    }

    public abstract void display();

    public void fly() {
        System.out.println("鸭子飞起来了。。。");
    }
}

