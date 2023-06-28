package main.com.Java_Collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("mango");

        System.out.println(fruitCollection);

        fruitCollection.remove("apple");
        System.out.println(fruitCollection);

        System.out.println(fruitCollection.contains("apple"));
        System.out.println(fruitCollection.contains("mango"));

        fruitCollection.forEach((element) ->{
            System.out.print(element+" ");
        });
    }
}
