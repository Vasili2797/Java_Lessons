package main.com.Design_Patterns;

public class User {
    public String name;

    public User(String name){
        this.name =name;
    }

    public void sayHello(){
        System.out.println("Hello my name is "+name);
    }
}
