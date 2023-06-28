package main.com.Java_Collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    
    public static void main(String[] args) {
        
        //How to create an ArrayList from another collection using the ArrayList(Collection c) constructor.
            //Create arraylist object
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        //THis is how we can create arraylist from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        
        List<Integer>nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        System.out.println(firstTenPrimeNumbers);
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
    }
}
