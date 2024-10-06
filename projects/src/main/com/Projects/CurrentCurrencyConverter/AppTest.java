package main.com.Projects.CurrentCurrencyConverter;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

//import org.springframework.boot.SpringApplication;

//import com.company.springboot.CurrencyConverterSpringApplication;

public class AppTest {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//		SpringApplication.run(CurrencyConverterSpringApplication.class, args);
		HttpRequest getRequest = HttpRequest.newBuilder()
				.uri(new URI("https://v6.exchangerate-api.com/v6/f3468cbc21776760eb1cebca/latest/USD"))
				.header("Autorizations", "f3468cbc21776760eb1cebca")
				.GET()
				.build();

		HttpClient httpClient = HttpClient.newHttpClient();
//		httpClient.send(postRequest, BodyHandlers.ofString());

		HttpResponse<String> postResponse = httpClient.send(getRequest, BodyHandlers.ofString());
		System.out.println(postResponse.body());
	}
	
	public void methodTest() {
		
	}
}
