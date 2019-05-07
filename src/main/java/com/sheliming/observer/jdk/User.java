package com.sheliming.observer.jdk;


import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String name;
    private String message;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        String message = (String)arg;
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到推送消息： " + message);
    }

}
