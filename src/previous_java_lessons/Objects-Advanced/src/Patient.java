import java.util.*;
class Patient {

  // 1. Create the encapsulated variables patientName, social, dateOfBirth, address, illness
  private String patientName;
  private String social;
  private String dateOfBirth;
  private String address;
  private String illness;


  public ArrayList<Payment> payments;

  // We are going to Construct our Patients (We are giving you these)


  // Constructor that just takes in our patientName and social.
  public Patient(String patientName, String social){
    this.patientName = patientName;
    this.social = social;
    payments = new ArrayList<>();
  }

  // Constructor that takes in all your variables
  public Patient(String patientName, String social, String dateOfBirth, String illness){
    this.patientName = patientName;
    this.social = social;
    this.dateOfBirth = dateOfBirth;
    this.illness = illness;
    payments = new ArrayList<>();
  }

  

  // Getters and Setters
  public void setPatientName(String patientName){
    this.patientName = patientName;
  }
  public String getPatientName(){
    return patientName;
  }
  public void setSocial(String social){
    this.social = social;
  }
  public void setDateOfBirth(String dateOfBirth){
    this.dateOfBirth = dateOfBirth;
  }
  public int getSocial(int social){
    return social;
  }
  public String getDateOfBirth(String dateOfBirth){
    return dateOfBirth;
  }


  // 2. Build your Getters and Setters for illness. 
  public void setIllness(String illness){
    this.illness = illness;
  }
  public String getIllness(){
    return illness;
  }

  // 3. Create a payment method that will add a payment to the patient.
  public Payment payment(double amount, String date){
    Payment thisPayment = new Payment(amount, date);
    payments.add(thisPayment);
    return thisPayment;

  }


  // 4. Create a payment method that gets all the payments for the patient. So all the bills.
  public ArrayList<Payment> payments(){
    //int payments = amount; 
    return this.payments;
  }


@Override
public String toString() {
		return "patientName=" + patientName + ", social=" + social + ", dateOfBirth=" + dateOfBirth + ", illness=" + illness + "]";
	}
}