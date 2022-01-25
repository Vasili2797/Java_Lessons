
public class toyotaPrius extends Car{
	
	public toyotaPrius(String model, String carInformation) {
		super(model, carInformation);
	}
	public void printName() {
		System.out.println(this.model);
	}
	public void printInformation(){
		System.out.println(this.carInformation);
	}

}
