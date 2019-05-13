package com.sheliming.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        final Singer target = new Singer();
        ISinger proxy  = (ISinger) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("向观众问好");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("谢谢大家");
                        return returnValue;
                    }
                });
        proxy.sing();
    }
}
