package main.com.Personal_Java_Lessons.lesson6_SwitchOperator;

public class OperatorSwitch {

    final int VALUE = 2, firstValue=1, secondValue =2, thirdValue=3;

    public void foo(){

        switch (VALUE){
            case firstValue:
                System.out.println(firstValue);
            case secondValue:
                System.out.println(secondValue);
            case thirdValue:
                System.out.println(thirdValue);
            default:
                System.out.println("Default");
        }
    }

    public static void main(String[] args){
        OperatorSwitch os = new OperatorSwitch();
        os.foo();
    }
}
