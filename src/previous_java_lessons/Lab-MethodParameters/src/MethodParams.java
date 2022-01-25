
public class MethodParams {
	
	public static void main(String[] args) {
		//create a class instance
		MethodParams mp = new MethodParams();
		
		//call your method here
		double result = mp.convertIntToDouble(25);
		
		//print the value to the console
		System.out.println(result);
		
		//call the second method here
		System.out.println(mp.sum(1.0, 2, 3));
	}
	
	//create your first method here
	
	public double convertIntToDouble(int num) {
		return (double)num;
	}
	
	//new sum method here
	public double sum(double num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}
