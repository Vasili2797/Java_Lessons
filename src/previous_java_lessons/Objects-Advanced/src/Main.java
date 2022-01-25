import java.util.*;

class Main {

  public static void main(String[] args) {

    Patient nick = new Patient("Nick","12345");
    Payment nickPayment = nick.payment(100.10, "9/23");
    Payment nickPayment2 = nick.payment(20.20,"8/13");
    //ArrayList<Payment> nickPayments = nick.payments();
    //ArrayList<Payment>




    // 5. You are a receptionist welcoming a new patient create a new patient taking in patient name and the social security number. Use the name John and the social security number of 12345.
    Patient patient1 = new Patient("John", "12345");
   

    // 6. You are a doctor diagnosing your patient above set the patients illness. Set John's illness to "cold"
    patient1.setIllness("cold");


    // 7. You are the billing agent who will add the payment to the patient you created. Create a Payment object that will take in the amount the patient owes, their name, and their Date of Birth. Use these values: 99.95, "June 15 2021
    patient1.payment(99.95, "June 15 2021");
    //this is where the first [] happens
    String pay = patient1.payments().toString();
    pay=pay.substring(1, pay.length() - 1);
    System.out.println(pay);
    //System.out.println(patient1.getIllness());


    // 8. Add payments to your patient (John) for billing purposes.
    patient1.setPatientName("John");
    System.out.println("Patient "+ patient1.getPatientName());



    // 9. Now send the payment to john (just print it so he can see)
    System.out.println("The following are the payments due ");
    //this is where the second one happens
    System.out.println(pay);


    // 10. Get all payments due to patient (John).
    System.out.println("The total amount due is "+ patient1.payments);
    
    

	}
    
}