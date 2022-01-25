
public class ClassA_review {
	int id;
	
	public ClassA_review() {
		System.out.println("Inside the constructor.");
		id =1;
	}
	public ClassA_review(int inputID) {
		System.out.println("Inside the constructor. "+id);
		id=inputID;
	}
	public static void main(String[] args) {
		ClassA_review a = new ClassA_review();
		System.out.println("After instantiation."+a.id);
		
		ClassA_review a2 = new ClassA_review(4);
		System.out.println("After instantiation."+ a2.id);
	}
}
