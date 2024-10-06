package main.com.Java_Collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample{

    public static void main(String[] args) {
        
        //How to check if an ArrayList is empty using the isEmpty() method
        List<String> topProgrammingLanguages = new ArrayList<>();
        
            //check if an ArrayList is empty
        System.out.println("Is the topProgrammingLanguages empty?: "+ topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("C");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add(".net");

        System.out.println("Is the topProgrammingLanguages empty?: "+ topProgrammingLanguages.isEmpty());
        if(!(topProgrammingLanguages.isEmpty())){
            System.out.println(topProgrammingLanguages);
        }
        //How to find the size of an ArrayList using the size() method
        System.out.println("This is the size of the list "+topProgrammingLanguages.size());
        //How to access the element at a particular index in an ArrayList using the get() method.
        String bestProgrammingLang = topProgrammingLanguages.get(1);
        System.out.println("bestProgrammingLang => "+ bestProgrammingLang);

        // String thirdElement = topProgrammingLanguages.
        //How to modify the element at a particular index in an ArrayList using the set() method
        String modifiedElement = topProgrammingLanguages.set(4, "C#");
        System.out.println(topProgrammingLanguages);
    }
}