package main.com.JavaProgrammingMasterclassUpdatedToJava17.BankAccountExercise;

public class ClassesChallenge {
    public static void main(String[] args) {
        Account appUser = new Account();
        appUser.setPhoneNumber("12345");
        appUser.setBalance(1000);
        appUser.setCustomerName("Bob Brown");
        appUser.setCustomerEmail("myemail@gmail.com");
        appUser.setPhoneNumber("(087) 123-4567");
        appUser.setAccountNumber(213451325);
        appUser.depositFunds();
        System.out.println();
        appUser.withdrawFunds();
        Account appUser2 = new Account(appUser.getAccountNumber(), appUser.getBalance(), appUser.getCustomerName(),
                appUser.getEmail(), appUser.getPhoneNumber());
        System.out.println(appUser2.toString());
    }
}
