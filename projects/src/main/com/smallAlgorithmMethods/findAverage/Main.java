package main.com.smallAlgorithmMethods.findAverage;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] newIntArray=new int[5];
        Random rand = new Random();
        for (int i = 0; i < newIntArray.length; i++) {
            newIntArray[i]=rand.nextInt(20);
        }
        System.out.println(Arrays.toString(newIntArray));
        Main m = new Main();
        m.findAverage(newIntArray);
    }

    private void findAverage(int[] input){
        int N=input.length;
        double sum=0.0;
        for (int i = 0; i < N; i++) {
            sum+=input[i];
        }
        double average=sum/N;
        System.out.println(average);
    }
}
