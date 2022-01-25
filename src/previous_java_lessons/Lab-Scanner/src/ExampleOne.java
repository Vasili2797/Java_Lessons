import java.util.Scanner;

public class ExampleOne {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type in a line and hit Enter.");
		
		String line= scanner.nextLine();
		System.out.println("You have typed: " + line);
		
		scanner.close();
		
		String numbers = "1 2 3 5 7 9";
		
		scanner = new Scanner(numbers);
		while(scanner.hasNextInt()) {
			
			System.out.print(scanner.nextInt());
		}
		scanner.close();
	}

}




/*

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    // 1. Create your Scanner object to get input from the keyboard.
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Please type in a line and hit Enter.");
    String result = "";
    result = scanner.nextLine();
    System.out.println("This is the line: " + result);
    
    //up to here it works
  

    // 2. Create a statement that ask the user their name. Create a variable that holds the users input from the keyboard. 
    //Scanner name1 = new Scanner(System.in);
    System.out.println("Please enter your name");
    String name = "";
    name = scanner.nextLine();
    System.out.println("Your name is: " + name);
    

    
  

    // 3. Make a print statement that returns "Hello Leo, it is nice to meet you."   
    //name = scanner.nextLine();
    name = "Leo";
    System.out.println("Hello " + name + ", it is nice to meet you");
    

    // 4. Create another Statement that ask the user where they live and create a variable that takes in the state you want your user to live in.
    System.out.println("Where do you live?");
    String state = scanner.nextLine();
    System.out.println("You live in " + state);



    // 5. Create a print statement that ask how old user is. And get Answer from keyboard.
    System.out.println("How old are you?");
    int age = scanner.nextInt();
    System.out.println("Your age is: " + age);



   // 6. Close your Scanner object. 
   scanner.close();

   
   // 7. Finish by combining your user inputs to one print statement.
   System.out.println(result +" " + name + " " + state+ " " + age);
  }
}
*/