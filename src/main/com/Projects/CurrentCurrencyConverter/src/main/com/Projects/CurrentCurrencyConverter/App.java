package main.com.Projects.CurrentCurrencyConverter;

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

public class App {
	static String apiKey = "";
	static String apiCallStringIUse = "";
	static String enteredCountry = null;
	static String CurrencyToExchangeFrom = null;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

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
				.header("Authorizations", apiKey).GET().build();

		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> postResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		String newHttpResponseString = postResponse.toString();

		System.out.println();
		JSONObject jsonObject = new JSONObject(postResponse.body());
		JSONObject getGEO = jsonObject.getJSONObject("conversion_rates");
		Object level = getGEO.get(enteredCountry);

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

	public static void doYouWishToContinue() throws IOException {
		System.out.println("Do you wish to continue? ");
		String input=reader.readLine();
		if(input.equalsIgnoreCase("yes")){
			System.out.println("Thank you");
		}else{
			System.out.println("Thank you for using our service\n");
			System.exit(0);
		}
	}

	public static String traverseAString(String str) {
		String correctString = str.toUpperCase();
		System.out.println(correctString);
		return correctString;
	}
}
