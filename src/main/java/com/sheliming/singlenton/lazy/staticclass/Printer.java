package com.sheliming.singlenton.lazy.staticclass;

/**
 * 打印机类
 * 静态内部类
 */
public class Printer {
    private static class PrinterHolder{
        public static Printer printer = new Printer();
    }

    private Printer() {
    }

    public static Printer getInstance() {

        return PrinterHolder.printer;
    }
}
