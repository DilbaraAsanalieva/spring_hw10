package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter
@ToString

public class Panda implements Animal{
    private String name;
    private String color;
    private String age;

    public Panda() {
    }

    public Panda(String name, String color, String age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void animalPlus() {

    }

    @Override
    public void animalMinus() {

    }


}
