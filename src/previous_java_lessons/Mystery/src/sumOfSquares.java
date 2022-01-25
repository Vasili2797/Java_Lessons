import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class sumOfSquares {

	public static void main(String[] args) {
		System.out.println("Please write four different numbers and press enter each time:");
		Scanner a = new Scanner(System.in);
		int a1=a.nextInt();
		Scanner b = new Scanner(System.in);
		int b1=b.nextInt();
		Scanner c = new Scanner(System.in);
		int c1=c.nextInt();
		Scanner d = new Scanner(System.in);
		int d1=d.nextInt();
		//System.out.println("Please write four different numbers:");
		
		int sumSquares= (int) (Math.pow(a1,2)+Math.pow(b1,2)+Math.pow(c1, 2)+Math.pow(d1, 2));
		
		System.out.println(sumSquares);
	
	}

}
