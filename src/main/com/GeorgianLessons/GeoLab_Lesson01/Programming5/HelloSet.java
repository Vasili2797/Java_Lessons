package main.com.GeorgianLessons.GeoLab_Lesson01.Programming5;

import java.util.*;

public class HelloSet {
    public static void main(String[] args) {
//        get_www_w3resource_com_java_exercises_collection_index_php();
        HashSet<String> hashSet = new HashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        hashSet.add("Irakli");
        hashSet.add("Arnold");
        hashSet.add("Bond");

        treeSet.add("Irakli");
        treeSet.add("Arnold");
        treeSet.add("Bond");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        Iterator<String> iterator1 = treeSet.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+" ");
        }
        System.out.println();
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("One");
        newArrayList.add("Two");
        newArrayList.add("Three");
        newArrayList.add("Four");
        newArrayList.add("Five");
        System.out.println(newArrayList);
        System.out.println();
        Collections.reverse(newArrayList);
        System.out.println(newArrayList);

        //work with the HashMap
        HashMap<String, String>map = new HashMap<>();



    }



    public static void get_www_w3resource_com_java_exercises_collection_index_php()
    {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(intArray));

        //Write a Java program to shuffle elements in a array list
        ArrayList<String> strList = new ArrayList<>();

        strList.add("One");
        strList.add("Two");
        strList.add("Three");
        strList.add("Four");

        System.out.println(strList);
        Collections.shuffle(strList);
        System.out.println(strList);
    }

    public static void sortArrayListRegardlessOfCapitalization(){

        //sort a given arraylist
        ArrayList<String> StringArray = new ArrayList<>();
        StringArray.add("Hello");
        StringArray.add("Sort");
        StringArray.add("this");
        StringArray.add("Arraylist");
        StringArray.add("Properly");
        StringArray.add("before");
        StringArray.add("it's");
        StringArray.add("Too");
        StringArray.add("Late");

        for (String s : StringArray) {
            // StringArray.sort();
            System.out.println(s);
        }

        System.out.println();
        Collections.sort(StringArray, String.CASE_INSENSITIVE_ORDER);

        System.out.println(StringArray);

    }
}