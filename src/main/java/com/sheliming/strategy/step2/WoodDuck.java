package com.sheliming.strategy.step2;

//木头鸭不会飞也不会叫，所以覆盖quack()和fly()方法
public class WoodDuck extends Duck{
    @Override
    public void display() {
        System.out.println("我是木头鸭");
    }

    @Override
    public void quack() {
    }

    @Override
    public void fly() {
    }
}
