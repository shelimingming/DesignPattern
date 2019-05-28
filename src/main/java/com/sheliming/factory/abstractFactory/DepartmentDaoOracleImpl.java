package com.sheliming.factory.abstractFactory;

public class DepartmentDaoOracleImpl implements DepartmentDao {
    @Override
    public void insert() {
        System.out.println("在oracle中插入department。。");
    }

    @Override
    public void get() {
        System.out.println("在oracle中获取department。。");
    }
}
