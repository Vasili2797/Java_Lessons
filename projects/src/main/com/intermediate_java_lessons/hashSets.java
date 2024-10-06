package main.com.intermediate_java_lessons;

import java.util.*;

public class hashSets {

    public static void main(String[] args){
        String[] things= {"apple", "bob", "ham", "bacon", "ham", "apple"};

        List<String> list = Arrays.asList(things);

        System.out.printf("%s ",list);
        System.out.println();

        Set<String> set = new HashSet<String>(list);

        System.out.printf("%s ",set); //It got rid of all the duplicate items
    }
}
