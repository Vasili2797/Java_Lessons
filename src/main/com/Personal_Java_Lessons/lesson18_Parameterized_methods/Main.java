package main.com.Personal_Java_Lessons.lesson18_Parameterized_methods;

public class Main {
    public static void main(String[] args){
        Body body = new Body();

        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Leg leg = new Leg();

        Robot robot = new Robot(body, smallHead);
        Robot<SmallHead> robot1 = new Robot(body, smallHead);
        Robot<MediumHead> robot2 = new Robot<MediumHead>(body, mediumHead);
        //Robot<SmallHead> robot= new Robot<Head>(body, smallHead);
        robot1.foo(robot2);
    }
}
