import java.util.Scanner;
import java.math.*;
public class mathematical {
	
	public static void main(String[] args) {
		double result = Math.abs(10) + Math.abs(-10);
		int power1 = (int) Math.pow(2,4);
		int power2 = (int)Math.pow(4, 2);
		int power3= (int)Math.pow(3,5);
		int power4= (int)Math.pow(5, 3);
		int power5= (int)Math.sqrt(16);
		
		System.out.println("First equation "+power1);
		System.out.println("Second equation "+power2);
		System.out.println("Third equation "+power3);
		System.out.println("Fourth equation "+power4);
		System.out.println("Fifth equation "+power5);
		
		double num=1.23;
		System.out.println("the sine of the radian 1.23 is: "+Math.sin(num));
		
		double result1 = Math.pow(5, 2.5);
		//section 3.6
		System.out.println(result1);
	}

}
