package com.sheliming.factory.simpleFactory;

public class Test {
    public static void main(String[] args) {
        UserDaoFactory userDaoFactory = new UserDaoFactory();

        UserDao mysql = userDaoFactory.createUserDao("mysql");
        mysql.get();
        mysql.insert();

        UserDao oracle = userDaoFactory.createUserDao("oracle");
        oracle.get();
        oracle.insert();
    }
}
