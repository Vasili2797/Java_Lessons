
public class StringMethods_review {
	
	public static void main(String[] args) {
		String str="Hello";
		
		System.out.println(str.equals("Hello"));//evaluates to true
		
		String s=new String("Hello");
		System.out.println(str==s);//this evaluates to false
		System.out.println(str.equals(s));//this evaluates to true
		//when comparing values of objects (Strings are objects), you should 
		//always use .equals method
		
		//use the length() method
		System.out.println(str.length());
		
		//use the indexOf() method
		System.out.println(str.indexOf('H'));
		
		//use the toUpperCase() method
		System.out.println(str.toUpperCase());
		
		//use the toLowerCase() method
		System.out.println(str.toLowerCase());
		
		//use the equalsIgnoreCase(String)
		String lowercase = str.toLowerCase();
		String uppercase = str.toUpperCase();
		System.out.println(lowercase.equalsIgnoreCase(uppercase));
		//This turned out to be true
		
		//use the substring method
		System.out.println(str.substring(2));
		
		for(int i=0;i<=9;i++) {
			System.out.println("Hello");
		}
		int i=1;
		while(i<=10) {
			System.out.println("The while loop Hi");
			i++;
		}
		
	}
}
