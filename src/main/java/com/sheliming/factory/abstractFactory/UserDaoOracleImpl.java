package com.sheliming.factory.abstractFactory;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void insert() {
        System.out.println("在oracle中插入user。。");
    }

    @Override
    public void get() {
        System.out.println("在oracle中获取user。。");
    }
}