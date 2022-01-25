import java.io.BufferedReader;
import java.io.InputStreamReader;

public class multiply {

	public static void main(String[] args) {
		BufferedReader obj = new BufferedReader(new InputStreamReader((System.in)));
		System.out.println("Enter the first number");
		int a= Integer.parseInt(obj.readLine());
		System.out.println("Enter the second number");
		int b=Integer.parseInt(obj.ReadLine());
		int c=0;
		
		for(int i=0;i<b;i++)
		{
			c = a + c;

			}
			System.out.println("The product is " +c);

			}

			
	}

