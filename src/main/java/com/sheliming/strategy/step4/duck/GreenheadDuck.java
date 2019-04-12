package com.sheliming.strategy.step4.duck;

import com.sheliming.strategy.step4.capablity.FlyWithWings;
import com.sheliming.strategy.step4.capablity.QuackWithGaGa;

public class GreenheadDuck extends Duck{
    public GreenheadDuck() {
        this.flyable = new FlyWithWings();
        this.quackable=new QuackWithGaGa();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }

}
