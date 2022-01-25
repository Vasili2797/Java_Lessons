import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
		System.out.println("How many starts would you like?");
		Scanner s = new Scanner(System.in);
		int numOfStars=s.nextInt();
		
		
		for(int i=1; i<=numOfStars; i++) {
			//this is the amount of rows
			for(int j=0; j<i; j++) {
				//this is the amount of columns
				System.out.print("*");
			}
			System.out.println();
			}
		for(int i=numOfStars-1; i>0;i--) {
			for(int j=0; j<i; j++) {
				//this is the amount of columns
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
