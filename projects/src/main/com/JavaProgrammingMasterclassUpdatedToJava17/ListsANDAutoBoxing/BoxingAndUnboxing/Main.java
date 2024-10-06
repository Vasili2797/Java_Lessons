package main.com.JavaProgrammingMasterclassUpdatedToJava17.ListsANDAutoBoxing.BoxingAndUnboxing;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15);

//        Integer deprecatedBoxing = new Integer(15);// Deprecated since JDK 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

        //Automatic
        Integer autoBoxed=15;
        int autoUnboxed=autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed=getLiteralDoublePrimitive();
        double resultUnboxed=getDoubleObject();

        System.out.println(resultBoxed);
        System.out.println(resultUnboxed);

        var ourNewList = getList(1,2,3,4,5);
        System.out.println(ourNewList);
    }

    private static ArrayList<Integer> getList(int... varargs) {
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs){
            aList.add(i);
        }
        return aList;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}
