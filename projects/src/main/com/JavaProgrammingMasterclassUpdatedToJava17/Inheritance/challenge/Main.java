package main.com.JavaProgrammingMasterclassUpdatedToJava17.Inheritance.challenge;

public class Main {
    public static void main(String[] args) {
        Worker salariedWorker = new Employee("Bob the Builder", "05/25/1975", "6/15/2012");
        System.out.println(salariedWorker);
        System.out.println("The Age= "+salariedWorker.getAge());
        System.out.println("The Pay= "+salariedWorker.collectPay());
        SalariedEmployee secondWorker=new SalariedEmployee("Bob the Builder the Second","05/25/1995",
                "6/15/2019",35000);
        System.out.println(secondWorker);
        System.out.println("Second employee age= "+secondWorker.getAge());
        System.out.println("Second Employee's Paycheck = $"+secondWorker.collectPay());
        secondWorker.retire();
        System.out.println("Second Employee's Paycheck = $"+secondWorker.collectPay());

        HourlyEmployee Mary = new HourlyEmployee("Mary","05/05/1979","03/03/2021",
                15);
        System.out.println(Mary);
        System.out.println("Mary's Paycheck =$"+Mary.collectPay());
        System.out.println("Mary's Holiday Pay= $"+Mary.getDoublePay());
    }
}
