package com.sheliming.factory.simpleFactory;

/**
 * 简单工厂
 */
public class UserDaoFactory {
    UserDao createUserDao(String name) {
        if ("mysql".equals(name)) {
            return new UserDaoMysqlImpl();
        } else if ("oracle".equals(name)) {
            return new UserDaoOracleImpl();
        } else {
            return null;
        }
    }
}
