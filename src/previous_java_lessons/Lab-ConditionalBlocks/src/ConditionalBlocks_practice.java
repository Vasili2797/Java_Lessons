
public class ConditionalBlocks_practice {
	
	public static void main(String[] args) {
		boolean firstCondition=false;
		boolean secondCondition=true;
		
		if(firstCondition) {
			System.out.println("Inside the if-statment");
			
			if(secondCondition) {
				System.out.println("Inside the nested if-statement");
			}
		}else if(secondCondition) {
				System.out.println(5);
		}else {
			System.out.println("inside the else-statement");
		}
		
		System.out.println("Outside of the if-statement");
		
	}
}

