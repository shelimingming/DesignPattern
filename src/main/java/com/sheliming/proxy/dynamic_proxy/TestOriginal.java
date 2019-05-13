package com.sheliming.proxy.dynamic_proxy;

import java.lang.reflect.*;

// TODO 运行有问题
public class TestOriginal {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //创建一个实例对象，这个对象是被代理的对象
        Singer target = new Singer();

        //创建一个与代理对象相关联的InvocationHandler
        SingerInvocationHandler<Singer> singerInvocationHandler = new SingerInvocationHandler<Singer>(target);

        //使用Proxy类的getProxyClass静态方法生成一个动态代理类
        Class<?> singerProxyClass = Proxy.getProxyClass(Singer.class.getClassLoader(), new Class<?>[]{ISinger.class});

        Constructor<?> constructor = singerProxyClass.getConstructor(SingerInvocationHandler.class);

        Singer singer = (Singer) constructor.newInstance(target);

        singer.sing();

    }

    static class SingerInvocationHandler<T> implements InvocationHandler {

        //invocationHandler持有的被代理对象
        T target;

        public SingerInvocationHandler(T target) {
            this.target = target;
        }

        /**
         * proxy:代表动态代理对象
         * method：代表正在执行的方法
         * args：代表调用目标方法时传入的实参
         */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("向观众问好");
            //执行目标对象方法
            Object returnValue = method.invoke(target, args);
            System.out.println("谢谢大家");
            return returnValue;
        }
    }
}
