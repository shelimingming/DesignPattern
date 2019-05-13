package com.sheliming.proxy.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "hello world!!!";
    }

    /**
     * 注册表其实不用写任何代码，在你的JAVA_HOME下bin目录下有一个rmiregistry.exe程序，需要在你的程序的classpath下运行该程序。
     * 如果是使用maven管理工程，则在target/classes目录中启动该程序
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            //也可以在代码中运行rmiregistry
            Registry registry = LocateRegistry.createRegistry(1099);

            MyRemoteImpl myRemote = new MyRemoteImpl();
            Naming.rebind("myRemote", myRemote);

            System.out.println("服务端开启...");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
