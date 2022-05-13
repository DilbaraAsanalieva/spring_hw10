package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Setter
@Getter

@Component
@Scope("prototype")
public class Person {
    @Value("${person2.name}")
    private String name;
    @Value("${person2.age}")
    private String age;
    @Autowired
    @Qualifier("cat")
    private Animal animal;
}