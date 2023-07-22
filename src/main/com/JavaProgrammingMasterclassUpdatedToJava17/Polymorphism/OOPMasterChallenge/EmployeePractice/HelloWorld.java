package main.com.JavaProgrammingMasterclassUpdatedToJava17.Polymorphism.OOPMasterChallenge.EmployeePractice;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Person someRandomEmployee = new Employee("random Employee","Employee");

        Employee managerEmployee = new Manager("Bob","Manager",50000);
        System.out.println("Manager object of type Employee .salary used:" +
                " "+managerEmployee.salary); // So the parent class has no ability to access child method

        Person managerPersonEmployee = new Manager("Bob","Manager",50000);
        managerPersonEmployee.parentClassMethod();

        Person manager = new Manager("employee","Manager",100000);
        int salaryOfManager = managerEmployee.getSalary();
        System.out.println(salaryOfManager);
        System.out.println(manager.getSalary());
        someRandomEmployee.newMethodDeclaredWithAParameter("random Employee=new Employee() class object");
        managerEmployee.newMethodDeclaredWithAParameter("Parameter Employee emp=new Manager() class object");
        manager.newMethodDeclaredWithAParameter("Parameter Manager class object");
    }
}
