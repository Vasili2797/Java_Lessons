package main.com.Personal_Java_Lessons.Array;

import java.util.Scanner;
import java.util.Arrays;
public class SortedArray {
    public static Scanner scan = new Scanner(System.in);
    // static int scannedNumber = scan.nextInt();
    static int[] intArray;

    public static int[] getIntegers(int arraySize){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arraySize];
        for(int i=0;i<arraySize;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] param){
        for(int i=0;i<param.length;i++){
            System.out.println("Element "+i+" contents "+param[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray){
        int[] sortedArray=new int[intArray.length];
        int[] reversedArray=new int[sortedArray.length];
        for(int i=0;i<intArray.length;i++){
            Arrays.sort(intArray);
        }
        sortedArray = Arrays.copyOf(intArray, intArray.length);
        // System.out.println(Arrays.toString(sortedArray));
        //It does sort
        for(int i=0;i<sortedArray.length;i++){
            // System.out.println("SortedArray? "+sortedArray[i]);
            //It works up to here
            for(int j=sortedArray.length-1;j>=0;j--){
                reversedArray[j]=sortedArray[i];
                i++;
            }
        }
        return reversedArray;
    }
}
