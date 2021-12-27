package main.com.Personal_Java_Lessons.lesson8_ForLoop_EnhancedForLoops;

public class ForLoop {

    int[] array={1,2,3};
    public void foo(){

        for(int i=1;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println();

        for(int j : array){
            System.out.println(j);
        }
    }

    public static void main(String[] args){
        ForLoop forLoop=new ForLoop();
        forLoop.foo();
    }
}
