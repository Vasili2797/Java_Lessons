
public class SwitchStatement_review {
	
	public static void main(String[] args) {
		int x=5;
		
		switch(x) {
		case 6:
			System.out.println("case 6 ran");
			break;
		
		default:
			System.out.println("Default case ran");
			break;
		
		case 7:
			System.out.println("case 7 ran");
			break;

		case 10:
			System.out.println("case 10 ran");
			break;
		
	
		}
	}
	
	private boolean isPalindrome(String phrase) {
		int length = phrase.length();
		int c =0;
		
		while(c<= length/2) {
			if(phrase.charAt(c) != phrase.charAt(length-c-1)) {
				return false;
			}
			
			c+=1;
		}
		return true;
	}

}
