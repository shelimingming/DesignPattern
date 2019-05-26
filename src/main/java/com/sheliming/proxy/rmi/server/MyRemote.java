package com.sheliming.proxy.rmi.server;

        import java.rmi.Remote;
        import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    // 返回值必须是原语或者可序列化类型
    // 需要抛出RemoteException异常
    public String sayHello() throws RemoteException;
}
