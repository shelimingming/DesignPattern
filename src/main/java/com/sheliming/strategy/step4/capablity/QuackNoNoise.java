package com.sheliming.strategy.step4.capablity;

public class QuackNoNoise implements Quackable{
    @Override
    public void quack() {
        System.out.println("鸭子不会叫。。。");
    }
}
