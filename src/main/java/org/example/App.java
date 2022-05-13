package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);


        Person person2 = context.getBean("person",Person.class);

        Person person = context.getBean("person",Person.class);

        Lion lion = new Lion("Lion","Gray","15");
        person.setName("Bema");
        person.setAge("19");
        person.setAnimal(lion);

        System.out.println(person2.getName() + " " + person2.getAge() + " "+ person2.getAnimal());


        System.out.println(person.getName()+" "+person.getAge()+" "+person.getAnimal());


        context.close();


    }
}
