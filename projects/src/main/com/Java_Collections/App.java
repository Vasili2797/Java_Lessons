package main.com.Java_Collections;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //adding numbers
        numbers.add(50);
        numbers.add(100);
        numbers.add(40);

        //Retrieving
        System.out.println(numbers.get(0));

        System.out.println("\nIteration #1: ");
        //Indexed for loop iteration
        for (int i=0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("\nIteration #2: ");
        for(Integer value : numbers){
            System.out.println(value);
        }

        //removing items
        numbers.remove(numbers.size()-1);

        System.out.println(numbers);
    }
}
