import java.util.Scanner;


public class ExampleOne {
	
	public static void main(String[] args) {
		System.out.println("Please write something!");
		Scanner scanner = new Scanner(System.in);
		
		String result = "";
		result = scanner.nextLine();
		scanner.close();
		
		System.out.println("Result: " + result);
		
	}

}


