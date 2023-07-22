package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge.EmployeePractice;

public class Manager extends Employee{

    private int salary;
    public Manager(String name, String type, int salary){
        super(name, type);
        this.salary=salary;
    }

    @Override
    public void newMethodDeclaredWithAParameter(String param){
        System.out.println("This is the child class parameter: "+param);
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public void parentClassMethod(){
            System.out.println("This is the child class method");
        }
}
