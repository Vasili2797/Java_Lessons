package main.com.intermediate_java_tutorial_thenewboston;
import java.util.*;


public class GenericMethod_<T> {
    public static void main(String[] args) {
        Integer[] iRay = {1,2,3,4};
        Character[] cRay={'b','u','c','k'};

        printMe(iRay);
        printMe(cRay);
    }
//    public static void printMe(Integer[] i){
//        for(Integer x: i){
//            System.out.printf("%s ", x);
//        }
//        System.out.println();
//    }
//    public static void printMe(Character[] c){
//        for(Character x: c){
//            System.out.printf("%s ", x);
//        }
//        System.out.println();
//    }

    //A generic method that will do all of what the previous two methods(printMe) do:
    public static <T> void printMe(T[] x){
        for(T b : x){
            System.out.printf("%s ", b);
        }
        System.out.println();
    }
}
