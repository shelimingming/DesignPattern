package com.sheliming.singlenton.lazy;

/**
 * 打印机类
 * 懒汉模式,双重校验锁
 */
public class Printer3 {
    private static Printer3 printer = null;

    private Printer3() {
    }

    public synchronized static Printer3 getInstance() {
        if (printer == null) {
            synchronized (Printer3.class) {
                if (printer == null) {
                    printer = new Printer3();
                }
            }
        }
        return printer;
    }
}
