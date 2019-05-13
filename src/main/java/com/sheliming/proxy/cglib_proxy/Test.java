package com.sheliming.proxy.cglib_proxy;

public class Test {
    public static void main(String[] args){
        //目标对象
        Singer target = new Singer();
        //代理对象
        Singer proxy = (Singer)new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法
        proxy.sing();
    }
}
