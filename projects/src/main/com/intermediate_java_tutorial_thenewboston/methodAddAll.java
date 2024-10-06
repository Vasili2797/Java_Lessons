package main.com.intermediate_java_tutorial_thenewboston;
import java.util.*;
public class methodAddAll {
    public static void main(String[] args) {
        String[] food={"apples", "beef", "corn", "ham"};
        List<String> list1=Arrays.asList(food);

        ArrayList<String> list2 = new ArrayList<String>();

        list2.add("Youtube");
        list2.add("Google");
        list2.add("Mtavari");

        for(String x: list2){
            System.out.printf("%s ", x);
        }

        Collections.addAll(list2, food);

        System.out.println();
        for(String y: list2){
            System.out.printf("%s ", y);
        }
        System.out.println();

        System.out.println(Collections.frequency(list2,"Google"));//check how many times an item is in list
        boolean tof=Collections.disjoint(list1,list2);
        System.out.println(tof);// prints out false if they have no items in common

        if(tof){
            System.out.println("These lists do not have anything in common");
        }else{
            System.out.println("These lists must have something in common!");
        }
    }
}
