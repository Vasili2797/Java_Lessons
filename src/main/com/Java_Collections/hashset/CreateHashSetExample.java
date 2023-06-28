package main.com.Java_Collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    
    public static void main(String[] args) {
        //Create a HashSet using the HashSet() constructor

        Set<String> programmingLanguages = new HashSet<>();
        //add new elements to it using the add() method
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("JavaScript");

        System.out.println(programmingLanguages);
        programmingLanguages.add("Java");//this will just simply override the previously defined element
        System.out.println(programmingLanguages);

        
    }
}
