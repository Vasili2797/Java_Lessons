import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//In order for this to work, I will need to go into settings on Internet Explorer and disable the protected mode in security
public class vsCodeTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World from VSCode!");
        String projectPath=System.getProperty("user.dir");
//        System.out.println(projectPath);
        // System.setProperty("webdriver.chrome.driver",projectPath+ "\\Java_Lessons\\SeleniumFramework\\drivers\\chromedriver\\chromedriver_win32\\chromedriver.exe");
        // WebDriver driver = new ChromeDriver();
        // driver.get("https://www.google.com/");
        // System.out.println(driver.getTitle());
        // Thread.sleep(5000);
        // driver.quit();
        
        System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\iedriver\\IEDriverServer_x64_4.3.0\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://www.google.com/");
//        Thread.sleep(3000);
        driver.close();
//        driver.quit();
        
    }
}
