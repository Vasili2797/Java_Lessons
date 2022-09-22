//THis works in Eclipse, but it does not work in VSCode
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectPath=System.getProperty("user.dir");
		// System.out.println(projectPath);
//		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// identify element
		WebElement p=driver.findElement(By.name("q"));
		//enter text with sendKeys() then apply submit()
		p.sendKeys("Selenium Java");
		List<WebElement> listOfInputElements=driver.findElements(By.xpath("//input"));
		int count=listOfInputElements.size();
		System.out.println(count);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
