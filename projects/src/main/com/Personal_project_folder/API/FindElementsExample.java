package main.com.Personal_project_folder.API;

import java.util.*;

public class FindElementsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,1);

        Optional<Integer> element= list.stream().findFirst();

        if(element.isPresent()){
            System.out.println(element);
        }else{
            System.out.println("stream is empty!");
        }

        Optional<Integer> element1 = list.stream().findAny();
        if(element.isPresent()){
            System.out.println(element.get());
        }else{
            System.out.println("Stream is empty");
        }
    }
}
