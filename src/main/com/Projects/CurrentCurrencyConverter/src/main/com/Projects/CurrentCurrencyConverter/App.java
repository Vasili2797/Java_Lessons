package main.com.Projects.CurrentCurrencyConverter.src;
/*
 * For this current moment, I will have to say that everything here functions as they should.
 * Next Step is to ask the user for a country
 * 
 * The website used: https://app.exchangerate-api.com/dashboard
 * The API key: "f3468cbc21776760eb1cebca"
 * Full api call string link: "https://v6.exchangerate-api.com/v6/f3468cbc21776760eb1cebca/latest/USD"
 * 
 * */

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

public class App {

	static String apiKey = "f3468cbc21776760eb1cebca";
	static String apiCallStringIUse = "https://v6.exchangerate-api.com/v6/f3468cbc21776760eb1cebca/latest/";

	static String enteredCountry = null;
	static String CurrencyToExchangeFrom = null;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	static String fixedCurrencyToExchangeString;

	public static void main(String[] args) {
		System.out.println("This app should be able to get the current price of any currency in real time"
				+ " and after finding the price in real time, it will give the option of how much I will get"
				+ "\nfor an exact amount in that instantaneous time. For example, 100 dollars in GBP at this instant.");
		System.out.println("From Which Currency?: ");

		try {
			userInput();
			System.out.println("To Which Currency?");
			enteredCountry = reader.readLine();
			String fixedCurrencyToBeExchangedIntoString = traverseAString(enteredCountry);
			System.out.println("The exchange Currency selected is: " + fixedCurrencyToBeExchangedIntoString);
			currentPriceFetchInUSD(fixedCurrencyToBeExchangedIntoString);
		} catch (URISyntaxException | IOException | InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public static void userInput() throws IOException {

		String input = reader.readLine();

		String correctInput = traverseAString(input);
		System.out.println("The country selected is: " + correctInput);
		CurrencyToExchangeFrom = correctInput;
		System.out.println("");
	}

	public static void currentPriceFetchInUSD(String str) throws URISyntaxException, IOException, InterruptedException {
		enteredCountry = str;
		HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI(apiCallStringIUse + CurrencyToExchangeFrom))
				.header("Autorizations", apiKey).GET().build();

		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> postResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		String newHttpResponseString = postResponse.toString();
		System.out.println(postResponse);

		JSONObject jsonObject = new JSONObject(postResponse.body());
		JSONObject getGEO = jsonObject.getJSONObject("conversion_rates");
		Object level = getGEO.get(enteredCountry);

		System.out.println(postResponse.body());

		System.out.printf("The value of 1 %s in %s is %s", CurrencyToExchangeFrom, enteredCountry, level);
	}

	public static String traverseAString(String str) {
		String correctString = str.toUpperCase();
		System.out.println(correctString);
		return correctString;
	}
}
