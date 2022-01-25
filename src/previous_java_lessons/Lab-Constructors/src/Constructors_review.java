
public class Constructors_review {
	
	public Constructors_review(int value) {
		System.out.println(value);
	}
	public Constructors_review() {
		System.out.println("Default constructor ran.");
	}
	
	
	public static void main(String[] args) {
		//create instances here
		Constructors_review csr = new Constructors_review(5839);
		
		//use the no-arg constructor
		Constructors_review c = new Constructors_review();
	}
}
