package com.Personal_Java_Lessons.lesson20_Keyword_Throw;

public class PerimeterSquare {

    public void getPerimeter(String str) throws PerimeterException{
        Square square = new Square();
        try {
            double side=Double.parseDouble(str);
            square.setSide(0);
        }catch(NumberFormatException nfe){
            throw new PerimeterException("String is incorrect",nfe);
        }
        catch (PerimeterException pe) {
            System.err.println(pe.getMessage());
        }
    }
}
