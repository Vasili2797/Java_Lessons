package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge.EmployeePractice;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Employee extends Person{
    private String name;
    private String type;

    public Employee(String name, String type){
        this.name=name;
        this.type=type;
    }

    public void parentClassMethod(){
        System.out.println("This is a parent class method");
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public void newMethodDeclaredWithAParameter(String param){
        System.out.println("This is the parent parameter: "+param);
    }
}



