package main.com.intermediate_java_lessons;

public class randomInt {
    public static void main(String[] args){
        //Given N, generate pseudo-random integer between 0 and N-1
        int N = Integer.parseInt(args[0]);
        double r = Math.random();
        int t= (int) (r*N);
        System.out.println(t);
    }
}
