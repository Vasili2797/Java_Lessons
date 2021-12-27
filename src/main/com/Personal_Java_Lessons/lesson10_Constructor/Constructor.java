package main.com.Personal_Java_Lessons.lesson10_Constructor;

public class Constructor {

    public void foo(){
        Flower flower = new Flower();
        flower.name="Lily";
        flower.color="Pink";

        Flower flower1 = new Flower("Rose","Red");

        System.out.println(flower.name+" "+flower.color);
        System.out.println(flower1.name+" "+flower1.color);
    }

    public static void main(String[] args){
        Constructor constructor=new Constructor();
        constructor.foo();
    }

}
