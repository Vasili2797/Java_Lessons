
public class mustangGT extends Car{
	
	public mustangGT(String model, String carInformation) {
		super(model, carInformation);
	}
	public void printName() {
		System.out.println(this.model);
	}
	public void printInformation() {
		System.out.println(this.carInformation);
	}

}
