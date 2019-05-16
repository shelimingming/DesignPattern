package com.sheliming.proxy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestReflect {
    // 私有无参构造方法
    private TestReflect() {
        System.out.println("---私有无参构造方法---");
    }

    // 私有有参构造方法
    private TestReflect(String a) {
        System.out.println("---私有有参构造方法---：" + a);
    }

    //定义私有类型的变量
    private static volatile TestReflect instance;

    //静态代码块
    static {
        System.out.println("---静态代码块---");
    }

    //定义一个静态共有方法
    public static TestReflect getInstance() {
        if (instance == null) {
            synchronized (TestReflect.class) {
                if (instance == null) {
                    return new TestReflect();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("/*****************************获取Class对象的三种方法*****************************/");
        //1.通过字面量直接获取，如XXX.class，这种字面量不会触发类的初始化。
        Class clazz1 = TestReflect.class;
        System.out.println("clazz1:" + clazz1);

        //2.通过Object类的getClass方法，如xxxObject.getClass()，这种方法会触发类的初始化。
        TestReflect testReflect = new TestReflect();
        Class clazz2 = testReflect.getClass();
        System.out.println("clazz2:" + clazz2);

        //3.通过Class的静态方法forName（），这种方式也会触发类的初始化。
        Class clazz3 = Class.forName("com.sheliming.proxy.reflect.TestReflect");
        System.out.println("clazz3:" + clazz3);

        System.out.println("/*****************************创建对象*****************************/");
        TestReflect testReflect1 = (TestReflect) clazz1.newInstance();
        System.out.println(testReflect1);

        System.out.println("/*****************************反射构造方法*****************************/");
        //获取所有的构造方法
        Constructor[] declaredConstructors = clazz1.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor);
        }
        //获取指定的构造方法
        Constructor declaredConstructor = clazz1.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);
        TestReflect testReflect2 = (TestReflect) declaredConstructor.newInstance("aa");
        System.out.println(testReflect2);

        System.out.println("/*****************************反射成员方法*****************************/");
        Method method = clazz1.getDeclaredMethod("getInstance");
        TestReflect testReflect3 = (TestReflect)method.invoke(testReflect2);
    }
}
