import java.util.Scanner;

public class gramsToPounds {
	
	public static void main(String[] args) {
		System.out.println("Pleases input the amount of grams you would like to convert to pounds!");
		
		Scanner scan = new Scanner(System.in);
		float g=scan.nextFloat();
		float p=(float)453.592;
		float answer = g/p;
		System.out.println(answer);
	}

}
