package com.sheliming.singlenton.hungry;

/**
 * 打印机类
 * 饿汉模式
 */
public class Printer {
    private static Printer printer = new Printer();

    private Printer() {
    }

    public Printer getInstance() {
        return printer;
    }
}
