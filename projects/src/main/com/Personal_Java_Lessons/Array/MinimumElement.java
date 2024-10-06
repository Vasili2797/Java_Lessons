package main.com.Personal_Java_Lessons.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int size=readInteger();
        System.out.println("The size of the array is: \n"+size);
        int[] arrayOfIntegers=readElements(size);
        System.out.println("The Array of numbers is: \n"+ Arrays.toString(arrayOfIntegers));
        int minValue=findMin(arrayOfIntegers);
        System.out.println("The minimum value inside of the array is:\n"+minValue);
    }
    // write code here

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        return element;
    }

    private static int[] readElements(int param){
        Scanner scan = new Scanner(System.in);
        int[] numbersEntered = new int[param];
        for(int i=0;i<param;i++){
            int elementEntered=scan.nextInt();
            scan.nextLine();
            numbersEntered[i]=elementEntered;
        }
        return numbersEntered;
    }

    private static int findMin(int[] param){
        int minimum=param[0];
        for(int i=1;i<param.length;i++){
            if(param[i]<minimum){
                minimum=param[i];
            }
        }
        return minimum;
    }
}