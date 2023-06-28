package main.com.GeorgianLessons.GeoLab_Lesson01;

import java.util.Scanner;

public class MethodTutorial {

    public static void main(String[] args) {
        System.out.println("Please enter two integer numbers to find maximum of two");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(max(x, y));

        System.out.println("Please write a number for factoring");
        int n = scanner.nextInt();
        System.out.println(factorial(n));

        System.out.println("The result of the two numbers in combinations using probability is : ");
        System.out.println(combinations(32,30)); //What happens when K is greater than N? Needs exception handling
    }


    private static int combinations(int n, int k){ //You cannot have the number K be greater than N
        int result = factorial(n) / (factorial(k) * factorial(n-k));
        try{
            if(k>n){
                System.err.println("You cannot have the second number be less than the first!");
            }
        }catch (Exception e){
            System.out.println("StackOverflow error!");
        }
        return result;
    }

    private static int max(int x, int y) {
        int result = -1;
        if (x > y) {
            result = x;
        } else {
            result = y;
        }
        return result;
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }


}