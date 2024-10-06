package main.com.Personal_Java_Lessons.lesson15_Interfaces;

public class Mi8 extends Helicopter implements VerticalTakeOff{

    @Override
    public void fly(){
        System.out.println("Helicopter Mi8");
    }

    @Override
    public void foo() {
        System.out.println("foo function override");
    }


    @Override
    public void verticalTakeOff() {
        System.out.println("Helicopter Mi8 vertical");
    }
}
