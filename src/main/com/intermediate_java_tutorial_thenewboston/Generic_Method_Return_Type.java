package main.com.intermediate_java_tutorial_thenewboston;

public class Generic_Method_Return_Type {

    public static void main(String[] args) {

        System.out.println(max("Apples","tator-tots","padre"));
        //the T, or generic method works for any data types.
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c){
        T m =a;
        if(b.compareTo(a) >0){
            m=b;
        }if(c.compareTo(m)>0){
            m=c;
        }
        return m;
    }
}
