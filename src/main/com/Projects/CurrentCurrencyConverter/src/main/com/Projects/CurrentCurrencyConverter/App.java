package main.com.Projects.CurrentCurrencyConverter;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import static main.com.Projects.CurrentCurrencyConverter.Main.doYouWishToContinue;

public class App {
	static String apiKey = "";
	static String apiCallStringIUse = "https://v6.exchangerate-api.com/v6/"+apiKey+"/latest/";
	static String enteredCountry = null;
	static String CurrencyToExchangeFrom = null;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static String correctInput;

	public static void userInput() throws IOException {
		String input = reader.readLine();
		correctInput = traverseAString(input);
		System.out.println("The country selected is: " + correctInput);
		CurrencyToExchangeFrom = correctInput;
		System.out.println("");
	}

	public static void WorkingCode() throws IOException, URISyntaxException, InterruptedException {
		System.out.println("Welcome. Thank you for using our service!");
		System.out.println("Which Currency Would You Like To Exchange?");
		userInput();

		System.out.println("To Which World Currency Would You Like To Exchange The "+ correctInput);
		enteredCountry = reader.readLine();
		String fixedCurrencyToBeExchangedIntoString = traverseAString(enteredCountry);
		System.out.println("The exchange Currency selected is: " + fixedCurrencyToBeExchangedIntoString);

		currentPriceFetchInUSD(fixedCurrencyToBeExchangedIntoString);
		doYouWishToContinue();
	}


	public static void currentPriceFetchInUSD(String str) throws URISyntaxException, IOException, InterruptedException {
		enteredCountry = str;
		HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI(apiCallStringIUse + CurrencyToExchangeFrom))
				.header("Authorizations", apiKey).GET().build();

		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> postResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		String newHttpResponseString = postResponse.toString();

		System.out.println();
		JSONObject jsonObject = new JSONObject(postResponse.body());
		JSONObject getGEO;
		Object level=null;

		try{
			getGEO = jsonObject.getJSONObject("conversion_rates");
			level = getGEO.get(enteredCountry);
		}catch (JSONException e){
			System.err.println("Wrong currency code was entered. Please review the Currency Code and enter" +
					" repeat the process!");
			WorkingCode();
		}

		System.out.println("How much money would you like to exchange?");

		Scanner scan = new Scanner(System.in);
		int amountOfCurrency=scan.nextInt();
		double levelInteger=((Number)level).doubleValue();
		double total=amountOfCurrency*levelInteger;

		System.out.printf("The value of 1 %s in %s is %s", CurrencyToExchangeFrom, enteredCountry, String.format("%.4f",level));
		System.out.println();
		System.out.printf("The value of %s %s in %s is %s", amountOfCurrency,
				CurrencyToExchangeFrom, enteredCountry, String.format("%.4f",total));
	}

	public static String traverseAString(String str) {
		String correctString = str.toUpperCase();
		System.out.println(correctString);
		return correctString;
	}
}
