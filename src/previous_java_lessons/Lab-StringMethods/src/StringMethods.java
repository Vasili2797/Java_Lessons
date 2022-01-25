
public class StringMethods {
	
	public static void main(String[] args) {
		String str = "Hello";
		String s = new String("Hello");
		
		System.out.println(str.equals(s));
		
		//use the length() method
		System.out.println(str.length());
		
		//Edit the class to print the index of the letter H
		System.out.println(str.indexOf('H'));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(2));
		System.out.println(str.equalsIgnoreCase("Hellow"));
		System.out.println(str.substring(3));
	}

}

