package com.sheliming.factory.factoryFunction;

public class MysqlFactory implements IFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoMysqlImpl();
    }
}
