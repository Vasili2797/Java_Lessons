package main.com.intermediate_java_lessons;
import java.util.*;

public class addAllMethod {

    public static void main(String[] args){

        //Convert some array to a list
        String[] shoppingList = {"Apples", "oranges", "tomato", "beef", "eggs"};
        List<String> list1 = Arrays.asList(shoppingList);

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("Youtube");
        list2.add("Google");
        list2.add("Facebook");

        for(String s:list2){
            System.out.printf("%s ", s);
        }

        Collections.addAll(list2, shoppingList);
        System.out.println();

        for(String s: list2){
            System.out.printf("%s ", s);
        }
        System.out.println();
        System.out.println(Collections.frequency(list2, "Facebook"));

        boolean tof = Collections.disjoint(list1, list2);
        System.out.println(tof);

        if(tof){
            System.out.println("These lists do not have anything in common!");
        }else{
            System.out.println("These lists must have something in common!");
        }
    }
}
