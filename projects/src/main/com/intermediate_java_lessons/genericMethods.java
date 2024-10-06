package main.com.intermediate_java_lessons;

import java.util.Comparator;

public class genericMethods {
    public static void main(String[] args){

        System.out.println(max(23,42,1));
        System.out.println(max("apples","tots","chicken"));

        Integer[] iray = {1,2,3,4};
        Character[] cray = {'b','u','c', 'k', 'y'};

        printMe(iray);
        printMe(cray);
    }

    //Not the best way to make a code like this, because of using the same name but just different arguments
    public static void printMe(Integer[] i){
        for(Integer x: i){
            System.out.printf("%s ", x);
        }
        System.out.println();
    }

    public static void printMe(Character[] i){
        for(Character x: i){
            System.out.printf("%s ", x);
        }
        System.out.println();
    }
    public static <T> void printMe(T[] x){
        for(T b: x){
            System.out.printf("%s ", b);
        }
        System.out.println();
    }

    //lets do the generic method
    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m = a;
        if(b.compareTo(a) >0){
            m = b;
        }
        if(c.compareTo(m) >0){
            m = c;
        }
        return m;
    }
}