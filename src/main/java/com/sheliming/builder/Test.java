package com.sheliming.builder;

public class Test {
    public static void main(String[] args) {
        PersonDirector manPersonDirector = new PersonDirector(new ManBuilder());
        Person man = manPersonDirector.createPerson();
        System.out.println(man);

        PersonDirector womanPersonDirector = new PersonDirector(new WomanBuilder());
        Person woman = womanPersonDirector.createPerson();
        System.out.println(woman);
    }
}
