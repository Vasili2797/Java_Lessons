import java.math.*;
public class ReturnTypes_review {
	
	public static void main(String[] args) {
		//create a class instance
		ReturnTypes rt = new ReturnTypes();
		
		//call your method here
		rt.returnNothing();
		boolean t = rt.returnBoolean();
		//call your returnBoolean method here
		System.out.println("The value of b is "+ t);
		
		//call your getPi method here
		System.out.println(getPi());
		
		//call your getAlphabetArray
		getAlphabetArray();
		
	}
	
	//create your first method here
	public void returnNothing() {
		System.out.println("Inside of a void method");
	}
	
	public boolean returnBoolean() {
		return true;
	}
	
	//create a method named getPi that returns the value of pi
	public static double getPi() {
		double x = Math.PI;
		return x;
	}
	
	public static void getAlphabetArray() {
		for(char c='a'; c<='z';c++) {
			char alphabet=c;
			System.out.print(alphabet);
		}
	}
}
