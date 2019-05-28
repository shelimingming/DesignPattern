package com.sheliming.factory.factoryFunction;

public class OracalFactory implements IFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoOracleImpl();
    }
}
