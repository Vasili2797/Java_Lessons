package main.com.smallAlgorithmMethods.findMax;

public class Main {
    public static void main(String[] args) {
        double[] doubleArray= {5.0,8.5,13.3,52.7,62.3,57.6,14.0};
        findMaximumInAnArray(doubleArray);
    }

    private static void findMaximumInAnArray(double[] input){
        double max=input[0];
        for (int i = 0; i < input.length; i++) {
            if(input[i] > max){
                max=input[i];
            }
        }
        System.out.println(max);
    }
}
