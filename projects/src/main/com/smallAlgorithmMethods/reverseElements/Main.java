package main.com.smallAlgorithmMethods.reverseElements;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray={3,5,7,9,11,15,20};
        reverseOrder(intArray);
        Double[] doubleArray = {1.24,4.5,8.5,8.6,25.7};
        reverseOrder(doubleArray);
    }

    private static <T> void reverseOrder(T[] input){
        int N = input.length;
        for (int i = 0; i < N/2; i++) {
            T temp = input[i];
            input[i]=input[N-1-i];
            input[N-1-i]=temp;
        }
        System.out.println(Arrays.toString(input));
    }
}
