import java.util.*;
public class MethodParams_review {
	
	public static void main(String[] args) {
		//create a class instance
		MethodParams_review mp= new MethodParams_review();
		
		//call your method here
		
		double d=mp.convertIntToDouble(44);
		System.out.println(d);
		
		double s = mp.sum(24.2, 2, 3);
		System.out.println(s);
		
		double[] squares=mp.square(4, 5, 6, 7);
		System.out.println(java.util.Arrays.toString(squares));
		
		
		
		String findFirst=mp.findFirstWord("gudanabati","araratis mta");
		System.out.println(findFirst);
	}
	
	//create your fist method here
	
	public double convertIntToDouble(int num) {
		return (double)num;
	}
	//new sum method here
	public double sum(double num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	//create a method that declares four int parameters, squares each, and places the results in a float array
	public double[] square(int num1, int num2, int num3, int num4) {
		double[] result= {num1*num1, num2*num2, num3*num3, num4*num4};
		return result;
		
	}
	
	//create a method that declares two String parameters. This  method should search through each parameter and determine
	//the word that should come first if they were sorted alphabetically
	public String findFirstWord(String string1, String string2) {
		char[] string1Array = string1.toCharArray();
		char[] string2Array = string2.toCharArray();
		
		for(int i=0;i<string1Array.length;i++) {
			if(string1Array[i] < string2Array[i]) {
				return string1;
			}
			if(string1Array[i] > string2Array[i]) {
				return string2;
			}
		}
		return string1;

	}
}
