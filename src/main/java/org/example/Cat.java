package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Setter@Getter
@Component
public class Cat implements Animal{
    @Value("${cat.name}")
    private String name;
    @Value("${cat.color}")

    private String color;
    @Value("${cat.age}")

    private int age;

    public Cat() {
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println("Cat+");

    }

    @Override
    public void animalMinus() {
        System.out.println("Cat-");

    }
}
