package main.com.Java_Collections.interfaces;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WaysToIterateOverList {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("C", "C++", "Java", "Spring", "Hibernate");

        System.out.println(courses.size());
        System.out.println("For loop");
        //basic for loop
        for(int i=0; i<courses.size(); i++){
            System.out.println(courses.get(i));
        }
        System.out.println();
        System.out.println("Enhanced for loop");
        //enhanced for loop
        for(String course: courses){
            System.out.println(course);
        }
        System.out.println();
        System.out.println("Using iterator for loop");

        //basic loop with iterator
        for(Iterator iterator = courses.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.println(course);
        }
        System.out.println();
        System.out.println("Using iterator while loop");

        //iterator with while loop
        Iterator iterator = courses.iterator();
        while(iterator.hasNext()){
            String course =(String) iterator.next();
            System.out.println(course);
        }
        System.out.println();
        System.out.println("Using the stream method");
        //java 8 stream + lambda example
        courses.stream().forEach(course -> System.out.println(course));
    }
}
