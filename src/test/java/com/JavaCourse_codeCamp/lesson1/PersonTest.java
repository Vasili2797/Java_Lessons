/*
package test.java.com.JavaCourse_codeCamp.lesson1;


import org.junit.jupiter.api.Test;
import sun.rmi.runtime.Log;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private static final String[] MY_STATE_VALUES ={"PENDING", "PROCESSING", "PROCESSED"};
    private static final int PROCESSED=42;
    private static final int PROCESSING = 41;
    private static final int PENDING =40;
    public String[] states(){
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }
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
        Person myPerson = new Person();
        Person myPerson2 = new Person();
        Person[] persons2 = {persons[0], null, myPerson, myPerson2, persons[3], persons[2],};

        int myState = PENDING;
        LoggingLevel state = LoggingLevel.PROCESSING;
        String myString = "myString";
        switch (myState){
            case PENDING:
                break;
            case PROCESSING:
                break;
            case PROCESSED:
                break;
            default:

        }
        for(LoggingLevel thisState: LoggingLevel.values()){
            if(thisState.equals(LoggingLevel.PENDING)){
                System.out.println("Pending!");
            }if(thisState.equals(LoggingLevel.PROCESSING)){
                System.out.println("Processing!");
            }if(thisState.equals(LoggingLevel.PROCESSED)){
                System.out.println("Processed!");
            }
        }
//        Person vip = persons2[5];
//        persons2[5].helloWorld();//if you want to see the result, put it inside the print statement
    }

}
*/