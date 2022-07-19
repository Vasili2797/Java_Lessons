package main.com.intermediate_java_lessons;

import java.util.LinkedList;
import java.util.Arrays;

public class arrayToListAndReverse {
    public static void main(String[] args){
        String[] stuff = {"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));
        theList.add("pumpkin");
        theList.add("apple");
        theList.addFirst("firstThing");

        //convert back into arn array
        stuff=theList.toArray(new String[theList.size()]);

        for(String x: stuff){
            System.out.printf("%s ",x);
        }
    }
}
