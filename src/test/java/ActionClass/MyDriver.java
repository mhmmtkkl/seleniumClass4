package ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {

	private static WebDriver driver =null;
	
	public static WebDriver GetDriver() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		 
		driver=new ChromeDriver();
		
		return driver;
		
	}
	
}
