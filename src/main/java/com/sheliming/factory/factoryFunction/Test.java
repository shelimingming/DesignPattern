package com.sheliming.factory.factoryFunction;

public class Test {
    public static void main(String[] args) {
        IFactory factory = new MysqlFactory();
        UserDao userDao = factory.createUserDao();
        userDao.get();
        userDao.insert();

        factory = new OracalFactory();
        userDao = factory.createUserDao();
        userDao.get();
        userDao.insert();
    }
}
