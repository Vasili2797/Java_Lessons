package com.Personal_Java_Lessons.lesson4_Operation;

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

    public int userInputMultiplication() {
        System.out.println("Hello");
        System.out.println("Please enter all numbers you would like to input!");
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> intArray= new ArrayList<>();

        System.out.println("Write Done when finished");
        while(scan.hasNextDouble()){
            intArray.add(scan.nextDouble());
        }
        int arrayLength =intArray.size();
        System.out.println(intArray);
        System.out.println("Size of the array is "+arrayLength);
        int sum=0;
        for(Double i : intArray){
            sum+=i;
        }
        System.out.println("The sum of the array is: "+sum);
        double average = sum/arrayLength;
        System.out.print("The average of the arraylist is: ");
        System.out.println((double) sum / arrayLength);
        return sum;
    }

        public static void main (String[]args){
            operation op = new operation();
            op.userInputMultiplication();
        }
    }
