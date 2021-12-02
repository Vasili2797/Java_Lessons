package com.Personal_Java_Lessons.lesson9_Arrays;

import java.util.Arrays;

public class myArrays {

    int[] array=new int[3];
    Candy[] box = new Candy[5];

    int[] array2 = {30,3,7};

    Candy firstCandy = new Candy();
    Candy secondCandy = new Candy();
    Candy thirdCandy = new Candy();

    Candy[] box1={firstCandy,secondCandy,thirdCandy};
    Candy[] box3;
    public void foo(){
        Candy candy = new Candy();
        box[0]=candy;
        System.out.println(array2[0]);
        System.out.println();
        for(int i=0; i<array2.length;i++){
            System.out.println(array2[i]);
        }

        int[][][] doubleArray= new int[][][] {{{1, 2}, {1, 2}}, {{3, 4}, {4, 5}}};
        System.out.println(Arrays.deepToString(doubleArray));
    }

    public static void main(String[] args){
        myArrays arrays= new myArrays();
        arrays.foo();
    }
}
