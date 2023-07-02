

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.json.JSONObject;

public class App {

	static String apiKey;
	static String apiCallStringIUse;

	static String enteredCountry = null;

	public static void main(String[] args) {
		System.out.println("This app should be able to get the current price of any currency in real time"
				+ " and after finding the price in real time, it will give the option of how much I will get"
				+ "\nfor an exact amount in that instantaneous time. For example, 100 dollars in GBP at this instant.");

		try {
			userInput();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		try {
			currentPriceFetchInUSD();
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

	}

	public static void userInput() throws IOException {

		System.out.println("Please input the currency code of the country which currency you would like to convert!");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		char firstLetter = input.charAt(0);
		if (!(Character.isUpperCase(firstLetter))) {
			char capitalLetter = Character.toUpperCase(firstLetter);
			enteredCountry = input.replace(input.charAt(0), capitalLetter);
		} else {
			enteredCountry = input;
		}
		System.out.println("The country selected is: " + enteredCountry);
	}

	public static void currentPriceFetchInUSD() throws URISyntaxException, IOException, InterruptedException {
		HttpRequest getRequest = HttpRequest.newBuilder().uri(new URI(apiCallStringIUse))
				.header("Autorizations", apiKey).GET().build();

		HttpClient httpClient = HttpClient.newHttpClient();

		HttpResponse<String> postResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		String newHttpResponseString = postResponse.toString();
		System.out.println(postResponse);

		JSONObject jsonObject = new JSONObject(postResponse.body());
		JSONObject getGEO = jsonObject.getJSONObject("conversion_rates");
		Object level = getGEO.get(enteredCountry);

		System.out.println(postResponse.body());
		System.out.printf("The value of 1 USD in %s is %s", enteredCountry, level);
	}
}
