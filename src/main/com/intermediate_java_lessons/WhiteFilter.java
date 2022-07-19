package main.com.intermediate_java_lessons;

import static sun.java2d.cmm.ColorTransform.In;

public class WhiteFilter {
    public static void main(String[] args){
        System.out.println(1.0 / 0.0); // with doubles it says infinity, with integers, it says / by zero error

        //how to do quadratic equations in Java
        //parse coefficients from command line, when using the code in command line
        //double b = Double.parseDouble(args[0]);
        //double c = Double.parseDouble(args[1]);

        //In this case we will use b =10, c=20
        double b = 10.0;
        double c = 20.0;
        //calculate roots of x*x + b*x + c
        double discriminant = b*b - 4.0*c;
        double d = Math.sqrt(discriminant);
        double root1 = (-b+d)/2.0;
        double root2 = (-b-d)/2.0;

        //print
        System.out.println(root1);
        System.out.println(root2);

    }
}
