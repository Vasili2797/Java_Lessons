import java.math.*;
public class MethodDeclaration_review {
	
	public static void main(String[] args) {
		//create a class instance
		MethodDeclaration_review review = new MethodDeclaration_review();
		//call your first method here
		review.talk();
		
		int value = 25;
		int sameValue = review.getInt(value);
		System.out.println(sameValue);
		
		System.out.println(review.sum(3.564, 4, 9));
		
		int random = review.randomNumber();
		System.out.println(random);
	}
	
	//create your first method here
	public void talk() {
		System.out.println("Inside of the talk mathod");
	}
	
	//create your second method here with arguments
	public int getInt(int input) {
		return input;
	}
	
	public double sum(double c, int a, int b) {
		
		return a+b+c;
	}
	
	//create a random number generator method
	public int randomNumber() {
		int d = (int)(Math.random()*50)+1;
		return d;
	}

}
