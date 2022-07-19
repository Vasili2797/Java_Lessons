package main.com.intermediate_java_lessons;

import java.util.*;


public class throughTheArrayList {
    public static void main(String[] args){
        String[] breakfast = {"eggs", "lasers", "hats", "pie"};

        List<String> list1 = new ArrayList<>();
        //add items to list
        for(String x: breakfast){
            list1.add(x);
        }

        String[] moreItems = {"lasers", "hats",};
        List<String> list2 = new ArrayList<>();
        //add items in list2 to list1
        for(String y: moreItems) {
            list2.add(y);
        }

        //if the items are already on the list1
        for(int i=0;i<list1.size();i++){
            System.out.printf("%s ", list1.get(i));// Gotta be printf function
            System.out.println(""); //If you add this, it will print things on new line
        }
        System.out.println("");
        //do the same thing to list 2
        for(int i=0;i<list2.size();i++) {
            System.out.printf("%s ", list2.get(i));// Gotta be printf function, and this is how you reference items
        }
        System.out.println();
        System.out.println();

        //print list number 1 again
        for(int i=0;i<list1.size();i++){
            System.out.printf("%s ", list1.get(i));// Gotta be printf function
            System.out.println(""); //If you add this, it will print things on new line
        }

        editList(list1, list2);
        System.out.println();
        for(int i=0;i<list1.size();i++){
            System.out.printf("%s ", list1.get(i));// Gotta be printf function
        }

        linkedListClassExample();
    }

    public static void editList(Collection<String> l1, Collection<String> l2){
        Iterator<String> it = l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next())){
                it.remove();
            }
        }
    }

    public static void linkedListClassExample(){
        String[] things = {"apples", "noobs", "pwnge", "bacon", "goATS"};
        List<String> list1 = new LinkedList<String>();
        for(String x: things){
            list1.add(x);
        }

        String[] things2 = {"sausage", "bacon", "goats", "harry potter"};

        List<String> list2 = new LinkedList<String>();
        for(String y: things2){
            list2.add(y);
        }

        list1.addAll(list2);
        list2 =null;
        System.out.println("\nprintMe method next");
        printMe(list1);
        System.out.println("\nremoveStuff method next");
        removeStuff(list1, 2, 4);
        System.out.println("\nprintMe method next");
        printMe(list1);
        System.out.println("\nreverseMe Method next");
        reverseMe(list1);
    }
    //printMe method
    private static void printMe(List<String> l){
        for(String b: l){
            System.out.printf("%s ", b);
        }
    }
    //removeStuff
    private static void removeStuff(List<String> l, int from, int to){
        l.subList(from, to).clear();
    }
    //revereMe
    private static void reverseMe(List<String> l){
        ListIterator<String> bobby =l.listIterator(l.size());
        while(bobby.hasPrevious()){
            System.out.printf("%s ", bobby.previous());
        }
    }
}
