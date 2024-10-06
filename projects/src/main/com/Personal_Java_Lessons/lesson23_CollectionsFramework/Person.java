package main.com.Personal_Java_Lessons.lesson23_CollectionsFramework;

public class Person {
    private String name;

    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person{"+
                "name='"+name+'\''+
                '}';
    }
}
