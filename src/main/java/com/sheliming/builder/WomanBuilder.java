package com.sheliming.builder;

public class WomanBuilder implements PersonBuilder {
    private Person person;

    public WomanBuilder() {
        person = new Person();//创建一个Person实例,用于调用set方法
    }

    @Override
    public void builderHead() {
        person.setHead("建造女人头部分");
    }

    @Override
    public void builderBody() {
        person.setBody("建造女人身体部分");
    }

    @Override
    public void builderFoot() {
        person.setFoot("建造女人四肢部分");
    }

    @Override
    public Person builderPersion() {
        return person;
    }


}
