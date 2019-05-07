package com.sheliming.observer.jdk;


import com.sheliming.observer.myself.Observerable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WechatServer extends Observable {
    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private String message;

    public WechatServer() {

    }

    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        setChanged();
        notifyObservers(s);
    }
}
