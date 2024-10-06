package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.LinkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Canberra");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);
//        gettingElements(placesToVisit);

//        printItinerary(placesToVisit);

        testIterator(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list){
        list.add("Auckland");
        list.add("Malibu");
        //Queue methods
        list.offer("Buenos Aires");
        list.offerFirst("Berlin");
        list.offerLast("London");
        // Stack Methods
        list.push("Copenhagen");
    }

    private static void removeElements(LinkedList<String> list){
        list.remove(4);
        list.remove("Berlin");
        System.out.println(list);
        String s1=list.remove(); // removes first element
        System.out.println(s1+" was removed");

        String s2=list.removeFirst(); // much clearer method of removing first item
        System.out.println(s2+" was removed");

        String s3 = list.removeLast();
        System.out.println(s3+" was removed");

        // Queue/Deque poll methods
        String p1=list.poll(); // removes first element
        System.out.println(p1+" was removed");
        String p2=list.pollFirst(); // removes the first element
        System.out.println(p2+" was removed");
        String p3=list.pollLast(); // removes the last element
        System.out.println(p3+" was removed");

        list.push("Sydney");
        list.push("Copenhagen");
        list.push("Buenos Aires");
        System.out.println(list);
        String p4=list.pop(); // removes first element
        System.out.println(p4+" was removed");

    }

    private static void gettingElements(LinkedList<String> list){
        System.out.println("Retrieved Element = "+list.get(2));

        System.out.println("First Element= "+list.getFirst());

        System.out.println("last Element= "+list.getLast());

        System.out.println("The position of Auckland is: "+list.indexOf("Auckland"));

        //Queue retrieval method
        System.out.println("Element from element()= "+list.element());

        //Stack retrieval method
        System.out.println("Element peekFirst()= "+list.peekFirst());
        System.out.println("Element from peekLast()= "+list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list){
        System.out.println("Trip Starts at "+ list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while(iterator.hasNext()){
            var town = iterator.next();
            System.out.println("--> From: "+previousTown+" to "+town);
            previousTown=town;
        }
        System.out.println("Trip ends at "+list.getLast());
    }

    private static void testIterator(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
//            System.out.println(iterator.next());
            if(iterator.next().equals("Malibu")){
                iterator.add("New York City");
            }
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println(list);
    }
}
