package main.com.Projects.CurrentCurrencyConverter.src.main.com.Projects.CurrentCurrencyConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class fetchCurrencyCode {
	public static void main(String[] args) throws IOException {
		Set<Currency> USD = new HashSet();
		USD= Currency.getAvailableCurrencies();
		Iterator<Currency> it = USD.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Now let's get into API again!");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String whatDidISay=reader.readLine();
		System.out.println(whatDidISay);
	}
}
