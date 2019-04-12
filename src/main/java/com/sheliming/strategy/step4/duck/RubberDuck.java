package com.sheliming.strategy.step4.duck;

import com.sheliming.strategy.step4.capablity.FlyNoWay;
import com.sheliming.strategy.step4.capablity.QuackWithGaGa;

public class RubberDuck extends Duck{

    public RubberDuck() {
        this.flyable =new FlyNoWay();
        this.quackable = new QuackWithGaGa();
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }

}
