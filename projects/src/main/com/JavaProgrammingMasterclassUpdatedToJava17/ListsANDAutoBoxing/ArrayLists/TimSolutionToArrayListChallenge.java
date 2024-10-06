package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.ArrayLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TimSolutionToArrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag=true;
        ArrayList<String> groceries = new ArrayList<>();
        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> howManyItems(groceries);
                case 3 -> removeItems(groceries);
                default -> flag=false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void howManyItems(ArrayList<String> groceries){
        System.out.println(groceries.size());
    }
    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items=scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for(String s : items){
            String trimmed=s.trim();
            if(groceries.indexOf(trimmed)<0){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items=scanner.nextLine().split(",");
//        groceries.addAll(List.of(items));
        for(String s : items){
            String trimmed=s.trim();
            groceries.remove(trimmed);
        }
    }


    private static void printActions(){
        String textBlock= """
               Available actions:
              
               0 - to shutdown
               
               1 - to add item(s) to list (comma delimited list)
               
               2- To see the size of the list
                                              
               3 - to remove any items (comma delimited list)
               
               Enter a number for which action you want to do:
                """;
        System.out.println(textBlock+" ");
    }

}
