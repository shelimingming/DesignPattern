package com.sheliming.factory.abstractFactory;

public interface IFactory {
    UserDao createUserDao();

    DepartmentDao createDepartmentDao();
}
