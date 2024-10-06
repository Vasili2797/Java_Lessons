package main.com.JavaProgrammingMasterclassUpdatedToJava17.Inheritance.challenge;

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static long employeeNo=1L;


    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId=Employee.employeeNo++;
        this.hireDate=hireDate;
    }

    public long getEmployeeId(){
        return employeeId;
    }

    public String hireDate(){
        return hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                " " + super.toString();
    }
}
