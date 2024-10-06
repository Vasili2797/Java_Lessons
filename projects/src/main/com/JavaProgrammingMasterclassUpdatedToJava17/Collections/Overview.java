package main.com.JavaProgrammingMasterclassUpdatedToJava17.Collections;

import java.util.*;

public class Overview {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] names ={"Anna", "Bob", "Carol", "David", "Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("George", "Gary", "Grace"));
        System.out.println(list);
        System.out.println("Is Gary on the list? "+list.contains("Gary"));
        list.removeIf(s -> s.charAt(0) =='G');
        System.out.print("the new list after removal \n");
        System.out.println(list);

        Collection<String> treeSetList = new TreeSet<>();
        treeSetList.addAll(list);
        System.out.println(treeSetList);
        Collection<String> hashSetList = new HashSet<>();
        hashSetList.addAll(list);
        System.out.println(hashSetList);
    }
}
