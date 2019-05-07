package com.sheliming.observer.jdk;


import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.addObserver(userZhang);
        server.addObserver(userLi);
        server.addObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.deleteObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");

    }
}
