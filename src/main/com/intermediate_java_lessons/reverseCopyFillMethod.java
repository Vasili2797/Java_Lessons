package main.com.intermediate_java_lessons;

import java.util.*;

public class reverseCopyFillMethod {

    public static void main(String[] args){
        //create an array and convert to list
        Character[] ray ={'p', 'w', 'n'};
        List<Character> l =Arrays.asList(ray);
        System.out.println("list is: ");
        output(l);

        //reverse and print out the list
        Collections.reverse(l);
        System.out.println("After reverse: ");
        output(l);

        //create a new array and a new list
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        //copy contents of list into listcopy
        Collections.copy(listCopy,l);
        System.out.println("Copy of list: ");
        output(listCopy);

        //fill collection with ray
        Collections.fill(l, 'S');
        System.out.println("After filling the list: ");
        output(l);
    }

    //the output method will be private since its only in class
    private static void output(List<Character> theList){
        for(Character s: theList){
            System.out.printf("%s ", s);
        }
        System.out.println();
    }
}
