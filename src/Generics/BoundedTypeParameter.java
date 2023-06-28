package Generics;

import main.com.intermediate_java_tutorial_thenewboston.listAndArrayListLessons;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        bankAccount<Integer> b1 = new bankAccount<>();
        Integer[] intNums ={100, 200, 300};
        Double[] doubleNums = {20.45, 30.56};
        b1.display(intNums);
    }
}

class bankAccount<T extends Number>{ //only works with the classes of Number: int,double,float,... You can have a class and an interface, not two classes.
    public void display(T[] t1){
        for(T i : t1){
            System.out.print(i+"\t");
        }
    }
}
