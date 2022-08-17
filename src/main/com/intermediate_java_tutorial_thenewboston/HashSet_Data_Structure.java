package main.com.intermediate_java_tutorial_thenewboston;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.Arrays;

public class HashSet_Data_Structure {
    //a collection that cannot contain any duplicate element
    public static void main(String[] args) {
        String[] things={"apple", "bob", "ham", "bob", "bacon"};
        List<String> list= Arrays.asList(things);

        System.out.printf("%s ", list);
        System.out.println();

        Set<String> set=new HashSet<String>(list);

        System.out.printf("%s ", set);
    }
}
