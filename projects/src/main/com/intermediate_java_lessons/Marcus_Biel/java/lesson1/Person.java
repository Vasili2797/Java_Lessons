package main.com.intermediate_java_lessons.Marcus_Biel.java.lesson1;

import javax.lang.model.element.Name;

public class Person {

    private Name personName;
    private static int PersonCounter;

    public Person(Name personName){
        this.personName = personName;
    }
    public Person(){
        PersonCounter++;

        /*
        empty on purpose - default constructor
        */
    }
    public String helloWorld(){
        return "Hello World!";
    }

    public String hello(String name) {
        return "Hello "+name;
    }

    public static int numberOfPersons() {
        return PersonCounter;
    }
}
