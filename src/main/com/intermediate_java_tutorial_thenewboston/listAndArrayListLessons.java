package main.com.intermediate_java_tutorial_thenewboston;

import java.util.*;

public class listAndArrayListLessons {
    public static void main(String[] args){
        String[] things= {"apples", "noobs", "pwnge", "bacon", "goATS"};
        List<String> l1=new LinkedList<String>();
        for(String x: things){
            l1.add(x);
        }
        String[] things2={"sausage", "bacon", "goats", "harrypotter"};

        List<String>l2=new LinkedList<String>();

        for(String y: things2){
            l2.add(y);
        }
        l1.addAll(l2);
        l2=null;

        //the future methods which we will make
        printMe(l1);
        removeStuff(l1, 2,5);
        printMe(l1);
        reverseMe(l1);
//
        //create an array, add items to an arraylist, then create and add more items

        String[] shoppingItems={"eggs", "bacon", "milk", "water"};
        List<String> shoppingList=new ArrayList<String>();

        String[] moreItems={"ice cream", "mask", "milk"};
        List<String> shoppingList2=new ArrayList<String>();

        for(String x: shoppingItems){
            shoppingList.add(x);
        }
        System.out.println(shoppingList);

        for(String y: moreItems){
            shoppingList2.add(y);
        }
        System.out.println(shoppingList2);
        System.out.println("The editList method");
        editList(shoppingList,shoppingList2);//this method only gives me items that are not in l2 only from l1.
        //so if a different item exists in l2, it will not be written. only l1

//        shoppingList.removeAll(shoppingList2);
//        shoppingList.addAll(shoppingList2);
//        Collections.sort(shoppingList);

        System.out.println("final list: ");
        for(int i=0;i<shoppingList.size();i++){//<= did not work. strictly less than
            System.out.printf("%s, ", shoppingList.get(i));
        }
    }
    //PrintMe method
    private static void printMe(List<String> l1){
        for(String c: l1){
            System.out.printf("%s ", c);
        }
        System.out.println();
    }

    //removeStuff method
    private static void removeStuff(List<String> l, int from, int to){
        l.subList(2,5).clear();
    }
    //reverseMe method
    private static void reverseMe(List<String> l){
        ListIterator<String> bobby=l.listIterator(l.size());
        while(bobby.hasPrevious()){
            System.out.printf("%s ", bobby.previous());
        }
    }

//    static <list, list2> void editList(List<String> shoppingList, List<String> shoppingList2){
//        System.out.println();
//        shoppingList2.removeAll(shoppingList);
//        System.out.println("shoppingList2 contains "+shoppingList2);
//    }
    public static void editList(Collection<String> l1, Collection<String> l2){
        Iterator<String> it=l1.iterator();//iterator that loops through list number 1
        while(it.hasNext()){
            if(l2.contains(it.next())){
                it.remove();
            }
        }
    }
}