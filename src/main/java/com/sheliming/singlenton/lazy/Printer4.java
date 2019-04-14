package com.sheliming.singlenton.lazy;

/**
 * 打印机类
 * 懒汉模式,双重校验锁
 */
public class Printer4 {
    private static volatile Printer4 printer = null;

    private Printer4() {
    }

    public synchronized static Printer4 getInstance() {
        if (printer == null) {
            synchronized (Printer4.class) {
                if (printer == null) {
                    printer = new Printer4();
                }
            }
        }
        return printer;
    }
}
