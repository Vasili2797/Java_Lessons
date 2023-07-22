package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge.EmployeePractice;

abstract class Person{
    private String name;
    private String type;
    public abstract void newMethodDeclaredWithAParameter(String param);

    public abstract void parentClassMethod();
    protected int salary;

    public abstract int getSalary();
}
