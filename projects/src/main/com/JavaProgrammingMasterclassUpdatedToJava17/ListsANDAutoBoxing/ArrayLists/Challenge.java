package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.ArrayLists;

import java.util.*;

public class Challenge {
    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>(100);
        groceryList.add("Water");
        groceryList.add("Seltzer");
        groceryList.add("Bread");
        groceryList.add("Soda");
        groceryList.add("Pickles");

        System.out.println(groceryList);

        for (int i = 0; i < groceryList.size(); i++) {
            if(groceryList.get(i).equalsIgnoreCase("Ketchup")){
                System.out.println("The ketchup is on the list");
            }else{
                groceryList.add("Ketchup");
                System.out.println("We need to get the ketchup");
                break;
            }
        }
        System.out.println(groceryList);
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);

        Collections.addAll(groceryList,"Soda","Balloons","Eggs");

        groceryList.set(0,"Cupcakes");
        String[] groceryListArray = {"Tomato","Pickles","Artichoke"};

        List<String> newStringList = new ArrayList<>(
                List.of(groceryListArray)
        );
        groceryList.addAll(newStringList);
        System.out.println(groceryList);
        String[] moreStringArrays={"Bar soap","Shampoo","Band-Aid"};
        groceryList.addAll(Arrays.asList(moreStringArrays));
        System.out.println(groceryList);

        groceryList.sort(Comparator.naturalOrder());
        System.out.println("Printing every second element in the arrayList");
        for(int i=0;i<groceryList.size();i+=2){
            System.out.println(groceryList.get(i));
        }
        System.out.println("Remove all the items whose names start with a Vowel");
        char[] vowels={'A','E','I','O','U', 'a','e','i','o','u'};
        for (int i = 0; i < groceryList.size(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (groceryList.get(i).charAt(0) == vowels[j]) {
                    groceryList.remove(groceryList.get(i));
                }
            }
        }
        groceryList.stream().forEach(i->System.out.print(i+", "));
        System.out.println();
        System.out.println("Remove duplicates");
        //Do not allow duplicate items in the arrayList
        Set<String> newSet = new HashSet<>();
        for(String s : groceryList){
            if(!(newSet.contains(s))){
                newSet.add(s);
            }
        }

        List<String> finalList = new ArrayList<>();
        finalList.addAll(newSet);
        finalList.sort(Comparator.naturalOrder());
        System.out.println(finalList);
    }
}
