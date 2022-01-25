import java.util.Scanner;

public class ExampleOne {
	
	public static void main(String[] args) {
		int value = 7;
		
		switch(value) {
		case 4:
			System.out.println("Case 4");
			break;
		case 5:
			System.out.println("Case 5");	
			break; //added code
		case 6:
			System.out.println("Case 6");
			break;
		default:
			System.out.println("Default case!");
		}
		
		System.out.println("This is the test for eclipse");
		System.out.println("Write a number");
		Scanner scan = new Scanner(System.in);
		int hola = scan.nextInt();
		System.out.println(hola +" is the number");
	}

}
//Simply put, it has a fall-through logic where if it enters the switch statement, the whole statement will
//execute in here