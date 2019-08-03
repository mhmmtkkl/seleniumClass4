package Class1Intorduction;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		
		/*get vs navigate 
		 * 
		 * get able to navigate to back,forward , refresh and to URL the page 
		 */
		driver.get("https://www.spring-education.co.uk/");
		
//		driver.navigate().to("https://www.facebook.com/");
//		
//		Thread.sleep(1000);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(1000);
//		
//		driver.navigate().forward();
//		
//		Thread.sleep(1000);
//		
//		driver.navigate().refresh();
		
	
		driver.manage().window().maximize();
	
		Thread.sleep(3000);
		
		driver.manage().window().setPosition(new Point(0,0));
		driver.manage().window().setSize(new Dimension(1024,768));
		
		driver.close();
		
	}
	
	
}
