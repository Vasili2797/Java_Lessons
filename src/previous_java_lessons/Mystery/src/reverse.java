
public class reverse {
	public static void main(String[] args) {
		int number =454;
		int temp = number;
		int reverse=0;
		
		while(number>0) {
			int lastNumber = number %10;
			reverse=(reverse*10)+lastNumber;
			number=number/10;
		}
		if(reverse==temp) {
			System.out.println("Number is a palindrome");
		}else {
			System.out.println("Number is not a palindrome");
		}
	}
}
