package com.Personal_Java_Lessons.lesson11_Encapsulation;

public class Encapsulation {

    private int a,b;
    private double pi=Math.PI;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;//the letter 'a' after assignment is the int a inside the parenthesis in setA, this.a is private int a
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int showResult(){
        return a+b;
    }

    public double getPi(){
        return pi;
    }

}
