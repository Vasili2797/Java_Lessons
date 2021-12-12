package com.Personal_Java_Lessons.lesson23_CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

    public static void main(String[] args) {

        LinkedList<Person> list = new LinkedList<>();

        Person person1 = new Person("Adam");
        Person person2 = new Person("Nickolas");

        list.add(person1);
        list.add(person2);

        Iterator<Person> iterator = list.iterator();

        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
    }
}
