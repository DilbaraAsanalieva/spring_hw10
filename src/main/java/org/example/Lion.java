package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;


@Setter@Getter
@ToString
@Component
public class Lion implements Animal{

    private String name;
    private String color;
    private String age;


    public Lion() {
    }

    public Lion(String name, String color, String age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println("Lion+");

    }

    @Override
    public void animalMinus() {
        System.out.println("Lion-");

    }
}
