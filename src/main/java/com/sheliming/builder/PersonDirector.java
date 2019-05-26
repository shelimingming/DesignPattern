package com.sheliming.builder;

/**
 * 指挥者类，用来控制建造的过程，让用户不用感知建造的细节
 */
public class PersonDirector {
    private PersonBuilder personBuilder;

    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    public Person createPerson() {
        personBuilder.builderHead();
        personBuilder.builderBody();
        personBuilder.builderFoot();
        return personBuilder.builderPersion();
    }
}
