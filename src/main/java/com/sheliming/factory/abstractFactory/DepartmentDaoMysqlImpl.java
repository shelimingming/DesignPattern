package com.sheliming.factory.abstractFactory;

public class DepartmentDaoMysqlImpl implements DepartmentDao {
    @Override
    public void insert() {
        System.out.println("在mysql中插入department。。");
    }

    @Override
    public void get() {
        System.out.println("在mysql中获取department。。");
    }
}
