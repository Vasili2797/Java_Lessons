
public class Main {
	public static void main(String[] args){
		calculator.use(1, 0);
	    System.out.println("Made it to the end!");
	    
	  }

	// 1. Make a Calculator Class
	// 2. Create a static method called calculate(int x, int y) in it that throws ArithmeticException. 
	// 3. In the calculate method have it print out x/y.


	// 4. Create a static method called use which takes in ints x and y 
	public void use(int x,int y){
	// 5. Create a try/catch block in use.
	  try{
	    // 6. In the try block call the calculate method
	    Calculator calculate = new Calculator();
	    Calculator.calculate(x, y);
	  }catch(ArithmeticException e) {
	    // 7. The first catch block should catch ArithmeticException and print out "Caught ArithmeticException" and "Don't divide by 0!".
	    e.printStackTrace();
	    System.out.println("Caught ArithmeticException");
	    System.out.println("Don't divide by 0!");
	  }catch(Exception e){
	    // 8. The second catch should block general exception making sure that our catch statements are from most specific to general. This catch block should print out "Some other exception".
	    System.out.println("Some other Exception");
	  }finally{
	    // 9. Also create a finally block that will state how it will always run if an exception is caught or not. This block should print out "This will always print out"
	    System.out.println("This will always print out");
	  }

	}}

