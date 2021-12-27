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

    @Test
    public void ShouldReturnNumberOfPersonsInLoop(){
        for(int i=0;i<4;i++){
            new Person();
        }
        assertEquals(4, Person.numberOfPersons());

        int j =0;
        while(j<4){
            new Person();
            j++;
        }
        assertEquals(8, Person.numberOfPersons());
        j=0;
        do{
            new Person();
            j++;
        }while(j<4);
        assertEquals(12, Person.numberOfPersons());
    }
    @Test
    public void demonstrateArrays(){
        Person[] persons=new Person[4];
        for(int i=0;i<persons.length;i++){
           persons[i] = new Person();
           persons[i].helloWorld();
       }
        for(Person person : persons){
            person.helloWorld();
        }

        Person[] persons2 = {};
    }

}
