import java.util.Scanner;
public class ExampleOne_review {
	
	public static void main(String[] args) {
		//create some dummy data for our method
		int input = 5;
		ExampleOne eo=new ExampleOne();
		//call your methods here
		System.out.println(eo.factorial(input));
		printChar('h');
	}
	
	//create your first method here
	public int factorial(int num) {
		if(num<=0) return 0;
		
		if(num==1) return 1;
		
		return num*factorial(num-1);
	
	}
	//create your second method here about alphabet
	public static void printChar(char letter) {
		if(letter < 'a' || letter > 'z') return;
		
		System.out.println(letter);
		letter -=1;
		printChar(letter);
}

}
