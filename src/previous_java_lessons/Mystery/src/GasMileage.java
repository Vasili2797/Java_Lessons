import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {
		int miles;
		double gallons, mpg;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Miles:");
		miles=scan.nextInt();
		
		System.out.println("Enter the number of gallons used:");
		
		gallons =scan.nextDouble();
		
		mpg=miles/gallons;
		System.out.println("Miles per gallon: "+mpg);
		
		Scanner myScanner = new Scanner(System.in);
		int value=0;
		System.out.println("What is your age?");
		value=myScanner.nextInt();
		System.out.println("You are "+value+" years old!");
		
	}
}
