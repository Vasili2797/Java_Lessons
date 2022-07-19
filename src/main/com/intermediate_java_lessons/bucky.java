package main.com.intermediate_java_lessons;

import java.util.ArrayList;
import java.util.List;

public class bucky {

    public static void main(String[] args){
        String[] words = {"funk", "chunk", "furry", "baconator"};

        for(String w: words){
            if(w.startsWith("fu")){
                System.out.println(w+" starts with fu");
            }
        }

        for(String s: words){
            if(s.endsWith("or")){
                System.out.println(s + " ends with or");
            }
        }

        //search for the index of the given letter in a string
        String searchString = "this is the string or maybe thisisthestringwelookfor";
        System.out.println("The index of first L is: "+searchString.indexOf('l'));
        //to start at a specific index
        System.out.println("The index of the third i is: "+searchString.indexOf('i', 7));

        //to find the start of a specific string inside the string
        System.out.println("The index of the string 'we': "+ searchString.indexOf("we"));

        //
        String a = "bacon ";
        String b="monster";
        System.out.println(a.concat(b));//Doesn't add space unless you add it yourself
        System.out.println(a.replace('a','e'));
        System.out.println(a.toUpperCase());
        //to get rid of the extra white space
        String c = "this        ";
        System.out.println(c.trim());//Only trims the extra white space if the string is only one word

        //calling the fact method in main
        System.out.println("The factorial of 10 is: "+fact(10));
    }

    //recursion
    //fact: you need the base case, elsewise you will get an infinite loop
    public static long fact(long n){
        if(n<=1){
            return 1;
        }else{
            return n *fact(n-1);
        }
    }
}
