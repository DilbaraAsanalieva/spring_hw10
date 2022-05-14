package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@Setter@Getter

public class Cat implements Animal {
    private String name;
    private String color;
    private String age;

    public Cat() {
    }

    public Cat(String name, String color, String age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    @Override
    public void animalPlus() {
        System.out.println("plus method");

    }

    @Override
    public void animalMinus() {
        System.out.println("minus method");

    }
}

