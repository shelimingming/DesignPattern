package com.sheliming.singlenton.lazy;

/**
 * 打印机类
 * 懒汉模式,带synchronized关键字
 */
public class Printer2 {
    private static Printer2 printer = null;

    private Printer2() {
    }

    public synchronized static Printer2 getInstance() {
        if (printer == null) {
            printer = new Printer2();

        }
        return printer;
    }
}
