package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name,"DAIRY",1);
    }

}

public class ListsANDAutoBoxing {
    public static void main(String[] args) {
        Object[] groceryArray=new Object[3];
        groceryArray[0]=new GroceryItem("milk");
        groceryArray[1]=new GroceryItem("apples","PRODUCE",6);
        groceryArray[2]="5 oranges";
        System.out.println(Arrays.toString(groceryArray));

        GroceryItem[] newGroceryItemArray=new GroceryItem[3];
        newGroceryItemArray[0]=new GroceryItem("milk");
        newGroceryItemArray[1]=new GroceryItem("apples","PRODUCE",6);
//        newGroceryItemArray[2]="5 oranges";  //Tpye error: GroceruItem expected, received a String
        newGroceryItemArray[2]=new GroceryItem("oranges","PRODUCE",5);

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> properList=new ArrayList<>();
        properList.add(new GroceryItem("Butter"));
        properList.add(new GroceryItem("Bread","PRODUCE",2));
        properList.add(0, new GroceryItem("apples","PRODUCE",6));
        System.out.println(properList);
        System.out.println();

        properList.set(0, new GroceryItem("apples","PRODUCE",6));
        System.out.println(properList);

        properList.remove(1);
        System.out.println(properList);

        properList.remove(properList.indexOf(new GroceryItem("Bread","PRODUCE",2)));
        System.out.println(properList);

        //Turn an array into a list
        String[] items={"apples","bananas","milk","eggs"};
        List<String> list = List.of(items);
        System.out.println(list);
//        list.add("Yogurt"); // Throws an UnsupportedOperations, ImmutableCollecitons,ListsANDAutoBoxing exceptions
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard","cheese"));
        System.out.println(nextList);

        groceries.removeAll(List.of("milk","eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("pickles","apples","bananas","Yogurt"));
        System.out.println(groceries);
        groceries.addAll(Arrays.asList("eggs","pickles","mustard","ham"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        String[] originalArray=new String[]{"First","Second","Third"};
        var originalList =Arrays.asList(originalArray);
        originalList.set(0,"one");
        System.out.println("list: "+originalList);
        System.out.println("array: "+Arrays.toString(originalArray));

//        originalList.add("Fourth");//Throws an UnsupportedOperationException
    }
}
