package main.com.Java_Collections.LinkedList;

import java.util.LinkedList;

public class removeElementsFromLinkedList {
    
    public static void main(String[] args) {
        
        LinkedList<String> fruitList = new LinkedList<>();
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Mango");
        fruitList.add("PineApple");

        System.out.println(fruitList);

        //remove the first element using the removeFirst() menthod
        String element =fruitList.removeFirst();

        System.out.println("After removing the first element using removeFirst() => "+fruitList);

        //remove the last element uusing the removeLast() method
        fruitList.removeLast();
        System.out.println("List after removing the last element: ");
        fruitList.stream().forEach(s -> System.out.print(s +" "));
        System.out.println();
        //remove all the elements
        fruitList.clear();
        System.out.println(fruitList);
    }
}
