
public class Loops_review {
	
	public static void main(String[] args) {
		//create a simple for-loop that prints the numbers 1 to 10
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		byte[] byteArray= {1, 2, 3, 4, 8, 11, 15, 19, 20, 127};
		for(byte b: byteArray) {
			System.out.println(b);
		}// this is how I did it
		
		//solution provided by Revature
		byte[] b = {1, 2, 3, 4, 8, 16, 32, 64, 67, 120};

		 for (int i = 0; i < b.length; i++) {
		 System.out.println(b[i]);
		 } 

		
	}

}
