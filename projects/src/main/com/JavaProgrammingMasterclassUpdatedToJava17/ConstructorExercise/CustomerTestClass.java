package main.com.JavaProgrammingMasterclassUpdatedToJava17.ConstructorExercise;

public class CustomerTestClass {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        double customer1CreditLimit=customer1.getCreditLimit();
        String customer1EmailAddress=customer1.getEmailAddress();
        System.out.println(customer1CreditLimit+" "+customer1EmailAddress+" "+customer1.getName());

        Customer customer2 = new Customer("Constructor with 3 args", 10000, "3argsemail@mail.net");
        String customer2Name=customer2.getName();
        double customer2CreditLimit=customer2.getCreditLimit();
        String customer2EmailAddress=customer2.getEmailAddress();
        System.out.println(customer2Name+" "+customer2CreditLimit+" "+customer2EmailAddress);

        Customer customer3 = new Customer("2 args constructor","2argsEmail@email.net");
        String customer3Name=customer3.getName();
        String customer3EmailAddress=customer3.getEmailAddress();
        double customer3CreditLimit=customer3.getCreditLimit();
        System.out.println("customer3 Name: "+customer3Name.concat(" ")
                .concat(customer3EmailAddress).concat(" ")
                +customer3CreditLimit);
    }
}
