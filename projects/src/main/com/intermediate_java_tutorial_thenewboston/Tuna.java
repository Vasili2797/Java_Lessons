package main.com.intermediate_java_tutorial_thenewboston;
import java.util.*;
import java.lang.Runnable;

public class Tuna implements Runnable{
    public static void main(String[] args) {

        Thread t1= new Thread(new Tuna("one"));
        Thread t2= new Thread(new Tuna("one"));
        Thread t3= new Thread(new Tuna("one"));
        Thread t4= new Thread(new Tuna("one"));
        t1.start();
        t2.start();
        t3.start();
        t4.start();


//        Thread t1=new Thread(new Tuna("one"));
//        Thread t2=new Thread(new Tuna("two"));
//        Thread t3=new Thread(new Tuna("three"));
//        Thread t4=new Thread(new Tuna("four"));
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
    }
    String name;
    int time;
    Random r= new Random();
    public Tuna(String x){
        name=x;
        time=r.nextInt(999);

    }
    public void run(){
        try{
            System.out.printf("%s is sleeping for %d\n", name,time);
            Thread.sleep(time);
            System.out.printf("%s is awake\n",name);
        }catch (Exception e){}
    }
}

/*
pick the packages from the heaviest to the lightest one:
finding the heaviest package
public static int solve(int weight0, int weight1, int weight2){
    int heaviestNum=0;
    if(weight0>weight1){
        if(weight0>weigh2){
            return 0;
        }else{
            return 2;
        }
        }else if(weight1>weight2){
        return 1;
        }else{
        return 2;
    }
}

finding the closest number to 0
int closet
*/