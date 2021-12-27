package main.com.Personal_Java_Lessons.lesson5_ControlOperators;

public class ControlOperators {
    int a=5,b=5;
    boolean value = false;

    public void foo(){
        if(value){
            System.out.println("True");
            a++;

            if(a<b){
                System.out.println("Yes");
            }
        }else if(b>a){
            System.out.println("False");
        }else{
            System.out.println("AAA");
        }
    }

    public static void main(String[] args){
        ControlOperators co = new ControlOperators();
        co.foo();
    }
}
