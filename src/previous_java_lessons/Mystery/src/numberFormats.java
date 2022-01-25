import java.util.Scanner;
import java.text.NumberFormat;

public class numberFormats {
	
	public static void main(String[] args) {
		final double tax_rate=0.06;
		
		int quantity;
		double subtotal, tax, totalCost, unitPrice;
		
		Scanner scan = new Scanner(System.in);
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		NumberFormat fmt2 = NumberFormat.getPercentInstance();
		
		System.out.println("Enter the quantity: ");
		quantity = scan.nextInt();
		
		System.out.println("Enter the unit price: ");
		unitPrice=scan.nextDouble();
		
		subtotal = quantity * unitPrice;
		tax = subtotal * tax_rate;
		totalCost = subtotal+tax;
		
		System.out.println("Subtotal: "+fmt1.format(subtotal));
		System.out.println("Tax: "+fmt1.format(tax)+" at "+ fmt2.format(tax_rate));
		
		System.out.println("Total "+fmt1.format(totalCost));
		
	}

}
