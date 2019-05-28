package com.sheliming.factory.abstractFactory;

public class OracalFactory implements IFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoOracleImpl();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new DepartmentDaoOracleImpl();
    }
}
