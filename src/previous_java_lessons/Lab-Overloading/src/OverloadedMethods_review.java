
public class OverloadedMethods_review {
	
	public static void main(String[] args) {
		//create instance here
		OverloadedMethods_review omr = new OverloadedMethods_review();
		omr.print();
		
		omr.print("second print method");
		omr.print("First String", "Second String");
	}
	
	//overload methods here
	public void print() {
		System.out.println("original print method");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str, String str2) {
		System.out.println(str+" "+str2);
	}
	
	
}
