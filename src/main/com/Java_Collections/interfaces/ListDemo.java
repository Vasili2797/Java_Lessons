package main.com.Java_Collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //adding duplicate elements
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");
        System.out.println(list);

        //adding null element
        list.add(null);
        list.add(null);
        System.out.println(list);

        
    }
}
