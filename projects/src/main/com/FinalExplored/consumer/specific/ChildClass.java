package main.com.FinalExplored.consumer.specific;

import main.com.FinalExplored.generic.BaseClass;

public class ChildClass extends BaseClass {
    @Override
    protected void optionalMethod() {
        System.out.println("[Child:optionalMethod] More things happened");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//        System.out.println("[Child:recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    private void mandatoryMethod(){
        System.out.println("[Child:mandatoryMethod] More things happened");
    }

    public static void recommendedStatic(){
        System.out.println("[Child:RecommendedStatic] BEST Way to Do it");
        optionalStatic();
    }

}
