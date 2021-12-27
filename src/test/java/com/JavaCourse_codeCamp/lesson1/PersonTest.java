package test.java.com.JavaCourse_codeCamp.lesson1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person();
        assertEquals("Hello World!",marcus.helloWorld() );
    }

    @Test
    public void shouldReturnMarcus(){
        Person person = new Person();
        assertEquals("Hello Marcus",person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person myPersons = new Person();

        assertEquals(4, Person.numberOfPersons());
    }

}
