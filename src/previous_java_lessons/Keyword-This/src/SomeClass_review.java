
public class SomeClass_review {

	long serialNumber;
	public SomeClass_review() {
		this(101);
		System.out.println("Inside default no-arg constructor.");
	}
	
	public SomeClass_review(long SerianNumber) {
		this.serialNumber = serialNumber;
		System.out.println("Inside constructor with parameter.");
	}
	public static void main(String[] 	args) {
		SomeClass_review sc = new SomeClass_review();
	}
}
