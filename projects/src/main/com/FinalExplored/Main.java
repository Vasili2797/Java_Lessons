package main.com.FinalExplored;

import main.com.FinalExplored.consumer.specific.ChildClass;
import main.com.FinalExplored.external.util.Logger;
import main.com.FinalExplored.generic.BaseClass;

public class Main {
    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();

        BaseClass childReferredToAsBase=new ChildClass();
        parent.recommendedMethod();
        System.out.println("-".repeat(30));
        System.out.println("This is the baseclass that was instantiated as a childclass");
        childReferredToAsBase.recommendedMethod();
        System.out.println("-".repeat(30));
        System.out.println("Child child method");
        child.recommendedMethod();

        System.out.println("-".repeat(30));
        parent.recommendedStatic();
        System.out.println("-".repeat(30));
        System.out.println("This is the baseclass that was instantiated as a childclass");
        childReferredToAsBase.recommendedStatic();
        System.out.println("-".repeat(30));
        System.out.println("Child child method");
        child.recommendedStatic();

        //Best way to do the code above without confusions
        System.out.println("-".repeat(30));
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();
        String xArgument="This is all I've got to say";
        StringBuilder zArgument=new StringBuilder("Only saying this: Section");
        doXYZ(xArgument, 16, zArgument);

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString()); // If it stayed as a StringBuilder, it would be empty after run
        tracker.append(", Step 2 is xyz");
        Logger.logToConsole(tracker.toString());
        System.out.println("After logging, tracker = "+tracker);
    }

    private static void doXYZ(String x, int y, final StringBuilder z){
        final String c=x+y;
        System.out.println("c= "+c);
        x=c;
        z.append(y);
//        z=new StringBuilder("Hello");
    }
}
