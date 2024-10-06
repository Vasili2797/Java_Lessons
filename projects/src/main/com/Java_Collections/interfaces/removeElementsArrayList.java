package main.com.Java_Collections.interfaces;

import java.util.ArrayList;
import java.util.List;

//remove()
//removeAll()
//clear()

public class removeElementsArrayList {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Peach");
        
        System.out.println(fruits);

        fruits.remove("Mango");
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);

        List<String> subFruits = new ArrayList<>();
        subFruits.add( "Pineapple");
        subFruits.add( "Cucumber");

        fruits.addAll(subFruits);
        System.out.println(fruits);
        fruits.removeAll(subFruits);
        System.out.println("after the removal using removeAll method to remove subFruits"+fruits);
    }
}
