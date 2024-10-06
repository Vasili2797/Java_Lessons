package main.com.SimplilearnAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please, enter words separated by space: ");
        Scanner scan = new Scanner(System.in);
        String scannedItem;
        String[] strArray = new String[7];
        int counter=0;
        while(counter!=6){
            scannedItem=scan.next();
            strArray[counter]=scannedItem;
            counter++;
        }

        Arrays.sort(strArray, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(strArray));

    }
}
