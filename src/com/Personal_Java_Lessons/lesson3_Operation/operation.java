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
        int nums = scan.nextInt();
        ArrayList<Integer> intArray= new ArrayList<>();

        boolean isOn=true;
        int letter = scan.nextInt();
        System.out.println("Input 1 if you want to add more numbers");
        while(isOn){
            switch (letter){
                case 1:
                    intArray.add(nums);
                case 2:
                    isOn=false;
                    System.out.println(intArray);
            }
        }
    }
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(reader.readLine()!=null) {
                int result;
                int int1=reader.read();
                int int2=reader.read();
                result=int1*int2;
                System.out.println(result);
            }
        }catch(IOException e){
                e.printStackTrace();
            }
        }*/
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please input any number of integers. Input 0 when done");
//        int count=0;
//        for (int number; (number= scan.nextInt())!= 1; count++) {
//            int result=1;
//            result=result*number;
//            System.out.println(result);
//        }
//        System.out.println(result);


        public static void main (String[]args){
            operation op = new operation();
            op.userInputMultiplication();
        }
    }
