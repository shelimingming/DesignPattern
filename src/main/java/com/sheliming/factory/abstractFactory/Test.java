package com.sheliming.factory.abstractFactory;

public class Test {
    public static void main(String[] args) {
        IFactory factory = new MysqlFactory();
        UserDao userDao = factory.createUserDao();
        userDao.get();
        userDao.insert();
        DepartmentDao departmentDao = factory.createDepartmentDao();
        departmentDao.get();
        departmentDao.insert();

        factory = new OracalFactory();
        userDao = factory.createUserDao();
        userDao.get();
        userDao.insert();
        departmentDao = factory.createDepartmentDao();
        departmentDao.get();
        departmentDao.insert();
    }
}
