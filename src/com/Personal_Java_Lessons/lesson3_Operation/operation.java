package com.Personal_Java_Lessons.lesson3_Operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class operation {

    Integer a=5, b=7,c;
    String str1="Java";
    String str2="Lessons";
    int result1;

    public void foo(){
        c=a+b*a;
        String result1=str1 +" "+str2;
        System.out.println(c);
        System.out.println(result1);
    }

    public void userInputMultiplication() {
        System.out.println("Hello");
        System.out.println("Please enter all numbers you would like to input!");
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> intArray= new ArrayList<>();

        System.out.println("Write Done when finished");
        while(scan.hasNextDouble()){
            intArray.add(scan.nextDouble());
        }
        System.out.println((intArray));
    }

        public static void main (String[]args){
            operation op = new operation();
            op.userInputMultiplication();
        }
    }
