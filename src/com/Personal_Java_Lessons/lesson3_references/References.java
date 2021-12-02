package com.Personal_Java_Lessons.lesson3_references;

public class References {

    String str1 = "My first string";
    String str2 = new String("Second string using the 'new' keyword");

    public void foo(){
        System.out.println(new String("method foo() String declaration"));

    }

    public static void main(String[] args){
        References references = new References();
        references.foo();
    }

    //printing a string through a method using dot operator on variable references
}
