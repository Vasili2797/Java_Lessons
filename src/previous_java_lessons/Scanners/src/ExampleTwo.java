import java.util.Scanner;

public class ExampleTwo {
	public static void main(String[] args) {
		
		//setup some string data
		String numbers = "1 2 3 4 5 6 7 8 9";
		
		//create scanner over String
		Scanner scanner = new Scanner(numbers);
		
		//iterate over data
		while(scanner.hasNextInt()) {
			System.out.print(scanner.nextInt());
			
			//print a comma if more numbers are available
			if(scanner.hasNextInt()) {
				System.out.print(",");
			}
		}
		
		//close scanner
		scanner.close();
	}

}
