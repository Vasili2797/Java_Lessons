package main.com.Java_Collections.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {
    
    public static void main(String[] args) {
        //add()
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println("initial linkedlist ->"+fruits);
        
        //add(2(location), element)
        fruits.add(2, "Watermelon");
        System.out.println("after adding Watermelon in specific location => "+fruits);
        
        //addFirst()
        fruits.addFirst("Tomato");
        System.out.println("After addFirst a tomato => "+fruits);
        //addLast()
        fruits.addLast("Avocado");
        System.out.println("After addLast an Avocado => "+fruits);
    }
}
