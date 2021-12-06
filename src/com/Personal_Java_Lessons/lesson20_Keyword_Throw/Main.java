package com.Personal_Java_Lessons.lesson20_Keyword_Throw;

public class Main {

    public static void main(String[] args){
        PerimeterSquare perimeterSquare = new PerimeterSquare();
        try {
            perimeterSquare.getPerimeter("String");
        } catch (PerimeterException e) {
            e.printStackTrace();
        }
    }
}
