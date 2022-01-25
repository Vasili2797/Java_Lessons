
public class ConditionalBlocks {
	public static void main(String[] args) {
		boolean b = true;
		
		if (b) {
			System.out.println("inside the if-statement");
		}
		else {
			System.out.println("Inside the else-statement");
		}
		System.out.println("Outside the if-statement");
	}
	

}
//why did they both print? it should be inside of the .... maybe because it did not skip the code, and went
//to the next code block, which was the outside statement?