package com.sheliming.singlenton.lazy;

/**
 * 打印机类
 * 懒汉模式
 */
public class Printer {
    private static Printer printer = null;

    private Printer() {
    }

    public Printer getInstance() {
        if (printer == null) {
            printer = new Printer();

        }
        return printer;
    }
}
