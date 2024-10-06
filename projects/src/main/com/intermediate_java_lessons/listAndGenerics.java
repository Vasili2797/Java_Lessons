package main.com.intermediate_java_lessons;

import java.util.*;

public class listAndGenerics {

    public static void main(String[] args) {
        String[] strArray ={"apples", "lemons", "juice", "melon", "geese", "youtube"};
        List<String> l1 = Arrays.asList(strArray);

        Collections.sort(l1);
        System.out.printf("%s\n", l1);//puts the list in alphabetical order

        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);
    }
}
