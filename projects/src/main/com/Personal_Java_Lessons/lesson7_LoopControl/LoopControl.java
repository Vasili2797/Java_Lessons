package main.com.Personal_Java_Lessons.lesson7_LoopControl;

public class LoopControl {

    boolean value = true;
    int a=5, b=10;

    public void foo(){
        do{
            System.out.println(a);
            a++;
        }while(a>=b);

        while(a<b){
            a++;//a++; when I have the function here it starts with 7, after it states a=5 and does first print
            System.out.println("A is still less than B because A is "+a);
            a++;//if I have a++ here, it starts with 6, 7, ..etc.
            //If I have both A++ before print statement and after, it just writes 7, 9, 10=10
        }
        if(a==b){
            System.out.println(a +" = "+b);
        }
    }

    public static void main (String[] args){
        LoopControl lp = new LoopControl();
        lp.foo();
    }
}
