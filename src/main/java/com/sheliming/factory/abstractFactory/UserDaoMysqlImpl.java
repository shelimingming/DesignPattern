package com.sheliming.factory.abstractFactory;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void insert() {
        System.out.println("在mysql中插入user。。");
    }

    @Override
    public void get() {
        System.out.println("在mysql中获取user。。");
    }
}
