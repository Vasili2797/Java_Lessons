
public class ClassA {
	
	int id;
	
	public ClassA() {
		System.out.println("Inside the constructor.");
		id =1;
	}
	
	public ClassA(int inputId) {
		System.out.println("Inside the Constructor. " + id);
		id = inputId;
	}
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		System.out.println("After the instantiation " + a.id);
		
		ClassA a2 = new ClassA(4);
		System.out.println("After the instantiation " + a2.id);

	}
	
}
