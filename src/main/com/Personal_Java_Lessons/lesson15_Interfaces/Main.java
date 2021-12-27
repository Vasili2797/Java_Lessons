package main.com.Personal_Java_Lessons.lesson15_Interfaces;

public class Main {
    public static void main(String[] args){
        Mi8 mi8 = new Mi8();
        Boeing737 boeing737 = new Boeing737();

        Test test= new Test();
        test.foo((VerticalTakeOff) mi8);

        test.foo(boeing737);

    }
}
