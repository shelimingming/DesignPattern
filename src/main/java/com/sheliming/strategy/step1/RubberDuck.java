package com.sheliming.strategy.step1;

public class RubberDuck extends Duck{

    //实现和父类不同，所以覆盖父类的方法
    @Override
    public void quack() {
        System.out.println("吱吱叫。。。");
    }

    @Override
    public void display() {
        System.out.println("我是橡皮鸭");
    }


}
