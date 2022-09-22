//This whole class works
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver =null;
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		//set the path for chrome driver executable
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.out.print(projectPath);
		//go to google.com
		driver.get("https://www.google.com/");
		//enter text in search textbook
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		//close the browser
		driver.close();
		
		System.out.println("Test completed successfully");
	}
}
