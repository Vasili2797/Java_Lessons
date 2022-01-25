
public class interest extends Bank{
	
	
	public static void main(String[] args) {
		Bank SBI = new Bank();
		Bank ICICI = new Bank();
		Bank AXIS = new Bank();
		SBI.rateOfInterest(8,"SBI");
		ICICI.rateOfInterest(7,"ICICI");
		AXIS.rateOfInterest(9,"AXIS");
	}

}
