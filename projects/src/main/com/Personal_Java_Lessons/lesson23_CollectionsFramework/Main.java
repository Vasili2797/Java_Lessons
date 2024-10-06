package main.com.Personal_Java_Lessons.lesson23_CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CollectionFramework framework = new CollectionFramework();
        List<Person> list = new ArrayList<>();

        Person person1 = new Person("John");
        Person person2 = new Person("James");

        //Do some linkedList work


//        list.add(person1);
//        list.add(person2);
////        check out the size of the list
//        System.out.println(list.size());
//        Iterator<Person> iterator = list.iterator();
////
////        while(iterator.hasNext()){
////            //if there is a next element give it to us
////            Person iterPerson =iterator.next();
////            //if there is a next element, remove it
////            //iterator.remove();
////        }
//
//
////        Person person1FromCollection = list.get(0);
////        Person person2FromCollection = list.get(1);
//        //to remove in an arraylist, do list.remove(person1) to remove person1, provided it exists
//        //System.out.println(list);
    }
}
