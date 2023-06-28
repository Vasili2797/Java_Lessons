package main.com.Java_Collections.LinkedList;

import java.util.LinkedList;

public class RetrieveLinkedListElementsExample {
    
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Pineapple");
        
        //print the whole LinekdList
        fruits.stream().forEach(s -> System.out.print(s+" "));
        System.out.println();
        //Getting the first element in the LinkedList using getFirst()
        String firstElement = fruits.getFirst();
        System.out.println("The first element using getFirst() => "+firstElement);

        //Getting the last element in the LinkedList using getLast()_
        String lastElement = fruits.getLast();
        System.out.println("The last element using the getLast() =>"+lastElement);

        //get the second element in the linkedlist using get(index)
        String elementInSecondPosition = fruits.get(2);
        System.out.println("Element in the second position... Zero indexed => "+elementInSecondPosition);
    }
}
