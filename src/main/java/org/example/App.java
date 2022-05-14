package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main( String[] args ){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("animal", Person.class);
        System.out.println(person);


        Person person1 = context.getBean("animal1", Person.class);
        System.out.println(person1);

        context.close();


    }
}
