import java.io.*;
import java.util.Scanner;
import java.lang.Math;
public class floatCube {
	
	public static void main(String[] args) {
		System.out.println("Please write three numbers");
		float a11=getExponent();
		float b11=getExponent();
		float c11=getExponent();
		
		float averageSum=(a11+b11+c11)/3;
		double cubeSum=Math.pow(averageSum, 3);
		float answer = (float)cubeSum;
		System.out.println(answer);
	}
	
	private static float getExponent() {
		Scanner a=new Scanner(System.in);
		int a1=a.nextInt();
		return (float)a1;
	}

}
