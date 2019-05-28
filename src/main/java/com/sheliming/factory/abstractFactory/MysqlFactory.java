package com.sheliming.factory.abstractFactory;

public class MysqlFactory implements IFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoMysqlImpl();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new DepartmentDaoMysqlImpl();
    }
}
