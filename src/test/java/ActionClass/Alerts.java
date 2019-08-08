package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
	  
	WebDriver driver;
	
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://chercher.tech/");
 
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//a[text()='Selenium Webdriver']")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 40);
//	
//	WebElement xButton = driver.findElement(By.xpath("//a[@title='Close']"));
//	
//	xButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Close']")));
//
//	xButton.click();
	driver.findElement(By.xpath("//a[text()='Handle Alerts in Selenium Webdriver']")).click();

	driver.findElement(By.xpath("//b[text()='https://chercher.tech/practice/practice-pop-ups-selenium-webdriver']")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@value='Alert']")).click();
	
	Thread.sleep(1000);
	
	driver.switchTo().alert().accept();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@value='Prompt']")).click();
	
	Thread.sleep(1000);
	
	driver.switchTo().alert().dismiss();
	
	Thread.sleep(1000);
	
	Actions actions = new Actions(driver);
	
	WebElement btn_DoubleClick= driver.findElement(By.xpath("//input[@id='double-click']"));
	 
	actions.doubleClick(btn_DoubleClick).perform();
	  
	wait.until(ExpectedConditions.alertIsPresent());
	
	String aleertText = driver.switchTo().alert().getText();
	
	System.out.println(aleertText);
	
	driver.switchTo().alert().accept();
	
	WebElement btn_SubMenu = driver.findElement(By.id("sub-menu"));
	
	actions.moveToElement(btn_SubMenu).perform();
	
	driver.findElement(By.id("link2")).click();
	
	driver.navigate().back();
	
	System.out.println("Section Ended");
	
	}
}
