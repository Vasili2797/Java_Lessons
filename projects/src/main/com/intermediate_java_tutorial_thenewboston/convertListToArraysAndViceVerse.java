package main.com.intermediate_java_tutorial_thenewboston;

import java.util.LinkedList;
import java.util.List;

import java.util.Arrays;

public class convertListToArraysAndViceVerse {

    public static void main(String[] args) {
        String[] stuff={"babies", "melons", "fudge", "watermelons"};

        LinkedList<String> theList=new LinkedList<String>(Arrays.asList(stuff));
        theList.add("pumpkin");
        theList.addFirst("firstThing");
        theList.addLast("lastThing");

        System.out.println("converted string array into a list and printed");

        System.out.println(theList);

        //convert it back to the array... parameters the size of the array
        stuff=theList.toArray(new String[theList.size()]);

        System.out.println();
        System.out.println("Converted the LinkedList back to an array and got this");

        for(String x: theList){
            System.out.printf("%s ", x);
        }
        System.out.println();
    }
}
