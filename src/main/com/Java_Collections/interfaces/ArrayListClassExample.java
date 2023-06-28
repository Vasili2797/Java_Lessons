package main.com.Java_Collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassExample {

    //How to create an ArrayList using the ArrayList() constructor and add new elements to an ArrayList using the add() method.
    public static void main(String[] args) {
        
        //created arraylist object
        List<String> fruits = new ArrayList<>(25);
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println(fruits);
    }
}
