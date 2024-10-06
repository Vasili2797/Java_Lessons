package main.com.Personal_Java_Lessons.lesson15_Interfaces;

public class Boeing737 extends Aircraft{

    @Override
    public void fly(){
        System.out.println("Boeing737");
    }

    @Override
    public void foo() {
        System.out.println("foo function");
    }
}
