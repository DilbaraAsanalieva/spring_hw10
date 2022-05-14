package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Person {
    private Animal animal;
    private String name;
    private int age;

    public Person() {
    }

    public Person(Panda panda) {

    }

    public Person(Animal animal, String name, int age) {
        this.animal = animal;
        this.name = name;
        this.age = age;
    }


}