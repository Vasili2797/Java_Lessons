package main.com.intermediate_java_tutorial_thenewboston;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
//import java.util.Collections;

public class CollectionsMethodSort {
    public static void main(String[] args) {
        String[] newString={"apples", "lemons", "geese", "bacon", "youtube"};
        List<String> l1= Arrays.asList(newString);

        Collections.sort(l1);
        System.out.printf("%s\n", l1);

        Collections.sort(l1, Collections.reverseOrder());
        System.out.printf("%s\n", l1);

        for(int i=1;i<5;i++){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }

        for(int i=4;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
