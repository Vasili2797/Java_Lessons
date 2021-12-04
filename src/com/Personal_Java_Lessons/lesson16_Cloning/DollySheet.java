package com.Personal_Java_Lessons.lesson16_Cloning;

public class DollySheet implements Cloneable{

    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
