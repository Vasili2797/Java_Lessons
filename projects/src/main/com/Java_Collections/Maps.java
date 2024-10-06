package main.com.Java_Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5,"Five");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(7, "Seven");
        map.put(4, "Four");

        String text = map.get(4);
        System.out.println(text);
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+": "+value);
        }
    }
}
