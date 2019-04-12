package com.sheliming.strategy.step3.Duck;

//木头鸭不会飞也不会叫
public class WoodDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是木头鸭");
    }

}
