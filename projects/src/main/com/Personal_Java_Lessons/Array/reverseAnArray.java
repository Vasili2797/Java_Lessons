package main.com.Personal_Java_Lessons.Array;

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] newIntArray={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reverseAnArray(newIntArray)));
    }

    public static int[] reverseAnArray(int[] param){
        int[] reversedIntArray = new int[param.length];
        for(int i=0;i<param.length;i++){
            //In here, I'm going through each element in Array
            System.out.println(param[i]);
            //It works up until here
            System.out.println();
            for(int j=param.length-1;j>=0;j--){
                //In here, I should put each element in reverse order;
                reversedIntArray[j]=param[i];
                i++;
            }
        }
        return reversedIntArray;
    }
}
