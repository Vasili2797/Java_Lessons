package main.com;

import java.util.Arrays;

public class tryArrays {
    public static void main(String[] args) {

        String[] newString = {"apples", "peaches", "mango", "banana", "cucumber"};

        int foundElement = Arrays.binarySearch(newString, "mango");
        System.out.println(foundElement);
    }
}
