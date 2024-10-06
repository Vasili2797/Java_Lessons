package main.com.intermediate_java_tutorial_thenewboston;

import java.util.*;

public class Collections_Specifically_For_List {
    public static void main(String[] args) {
        //create an array and convert to list
        Character[] ray={'p', 'w', 'n'};
        List<Character> l=Arrays.asList(ray);
        System.out.println("List is: ");
        output(l);

        //reverse and printout the list

        Collections.reverse(l);
        System.out.println("After reverse: ");
        output(l);

        //create a new array
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        //copy contents of list into listcopy
        Collections.copy(listCopy, l);
        System.out.println("Copy of list: ");
        output(listCopy);

        //fill collection with something
        Collections.fill(l,'Z');
        System.out.println("After filling the list: ");
        output(l);
    }
    private static void output(List<Character> theList){
        for(Character c: theList){
            System.out.printf("%s ", c);
        }
        System.out.println();
    }
}
