package packageOne;
import packageTwo.ProtectedSubClass_review;

public class AccessModifiers_review {
	
	public static void main(String[] args) {
		//access class methods here
		Person_review adam = new Person_review();
		adam.age =15;
		
		System.out.println(adam.age);
		
		ProtectedSubClass_review psc = new ProtectedSubClass_review();
		psc.printID();
		
	}
	
}
