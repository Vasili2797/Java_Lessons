package main.com.Java_Collections.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIterationExample {
    
    public static void main(String[] args) {

        LinkedList<String> progLangs = new LinkedList<>();

        progLangs.add("C");
        progLangs.add("C++");
        progLangs.add("Core Java");
        progLangs.add("Core Java");
        progLangs.add("Java EE");
        progLangs.add("Spring Framework");
        progLangs.add("Spring Framework");
        progLangs.add("Core Java");
        progLangs.add("Hibernate Framework");

        System.out.println(progLangs.contains("C"));

        int index = progLangs.indexOf("Core Java");
        System.out.println("The first occurence of Core Java => "+index);

        //Fid the index of the last occurence of an element in the LinkedList
        int lastOccurence = progLangs.lastIndexOf("Spring Framework");
        System.out.println("Last occurence of Spring Framework using the lastIndex() method "+lastOccurence);

        //using the iterator
        Iterator<String> iterator = progLangs.iterator();
        while (iterator.hasNext()) {
            String prog = (String) iterator.next();
            System.out.println(prog);
        }

        System.out.println();
        //forEach
        progLangs.forEach((element) ->{
            System.out.println(element);
        });

        System.out.println();
        //for each advanced loop
        for(String e : progLangs){
            System.out.println(e);
        }

    }
}
