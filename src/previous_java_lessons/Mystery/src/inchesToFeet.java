import java.util.Scanner;

public class inchesToFeet {
	
	public static void main(String[] args) {
	System.out.println("One foot is 12 inches long");
	System.out.println("Please write number in inches");

	Scanner n = new Scanner(System.in);
	int n1=n.nextInt();
	double answer = n1/12;
	System.out.printf("Your input of "+n1+" in feet is %.2f\n\""+answer);
	

}
}
