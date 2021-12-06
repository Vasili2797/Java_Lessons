package com.Personal_Java_Lessons.lesson20_Keyword_Throw;

public class Square {
    private double side;

    public double getSide(){
        return side;
    }

    public void setSide(double side) throws PerimeterException{
        if(side<=0){
            throw new PerimeterException("Number of sides is incorrect");
        }
        this.side=side;
    }
}
