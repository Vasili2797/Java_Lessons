
public class OverloadedMethods {
	
	public static void main(String[] args) {
		//create instance here
		OverloadedMethods om = new OverloadedMethods();
		   om.print();
		   om.print("Second print method");
		   om.print("second", "third");
	}
	
	//overload methods here
	public void print() {
		System.out.println("Original print method.");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
	

}


public class CreditCard{

	  private String name;
	  private String creditCardNumber;
	  private String expirationDate;
	  private int cvv;

	  public void setName(String name){
	    this.name = name;
	  }

	  public String getName(){
	    return name;
	  }
	  
	// 1. Create the remaining getters and setters
	  public void setNumber(String creditCardNumber){
	    this.creditCardNumber = creditCardNumber;
	  }
	  

	}