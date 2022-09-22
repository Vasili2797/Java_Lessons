package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		//set the path for chrome driver executable
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageOBJ = new GoogleSearchPageObjects(driver);
		driver.get("https://google.com");
		
		searchPageOBJ.setTextInSearchBox("A B C D");
		
		searchPageOBJ.clickSearchButton();
		driver.close();
	}
}
