import java.lang.*;
import java.util.Scanner;

public class DisplayingArrays_review {
	
	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0]=-5123;
		intArray[2]=32;
		System.out.println("Please enter index");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		try {
			System.out.println(intArray[num]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of bounds");
		}
		
	}
}
