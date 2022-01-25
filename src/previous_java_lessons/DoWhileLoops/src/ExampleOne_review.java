
public class ExampleOne_review {
	
	public static void main(String[] args) {
		boolean on=false;
		
		do{
			System.out.println("Inside the do-while loop");
		}while(on);
		int i=1;
		do {
			System.out.println(i);
			i+=2;
		}while(i<=49);
		
		char letter='a';
		char end='z';
		
		do {
			System.out.println("do-while loop alphabet "+letter);
			letter++;
		}while(letter<=end);
		
		for(char letters='a';letters<='z';letters++) {
			System.out.println("for loop alphabet "+letters);
		}

}
}
