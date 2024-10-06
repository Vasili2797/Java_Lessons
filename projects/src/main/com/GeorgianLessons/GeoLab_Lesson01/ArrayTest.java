package main.com.GeorgianLessons.GeoLab_Lesson01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        int[] intArrayOne = new int[7];
        intArrayOne[0] = 1;
        intArrayOne[1] = 2;
        intArrayOne[2] = 3;
        intArrayOne[3] = 4;
        intArrayOne[4] = 5;
        intArrayOne[5] = 6;
        intArrayOne[6] = 7;
//        intArray[7] = 5; //if you add more than the size, it's index out of bounds exception

        System.out.println("The first thing here is the scanner");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] intArray = initArray(length);

        printArray(intArray);
        System.out.println();

        for(int i=0;i<intArrayOne.length; i++){
            System.out.println(intArrayOne[i]);
        }

        int[] newIntArray = new int[]{1,2,3,4,5,6};
        printArray(newIntArray);
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();

        String one = "Joseph";
        String two = "Joseph";
        if(one.equals(two)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("t","telephone");
        map.put("r","rabbit");
        System.out.println(map.get("t"));
    }
    
    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    

    private static int[] initArray(int length){
        int[] newArray = new int[length];
        for (int i = 0; i < length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }
}
