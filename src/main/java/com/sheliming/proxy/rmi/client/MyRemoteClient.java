package com.sheliming.proxy.rmi.client;

import com.sheliming.proxy.rmi.server.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemote myRemote = (MyRemote) Naming.lookup("rmi://127.0.0.1/myRemote");
            String s = myRemote.sayHello();
            System.out.println(s);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
