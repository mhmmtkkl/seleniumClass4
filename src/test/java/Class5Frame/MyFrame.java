package Class5Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		  
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://hugelearning.com/iframe-practice-page/");
		
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@id='IFrame1']"));
	
		driver.switchTo().frame(myFrame);
		
		 WebElement FirstName = driver.findElement(By.xpath("//input[@name='First_Name']"));
		 
		 FirstName.sendKeys("Jack");
		
		 WebElement LastName = driver.findElement(By.xpath("//input[@name='Last_Name']"));
		 
		 LastName.sendKeys("Kerry");
		
		 WebElement DateofBirthDay = driver.findElement(By.xpath("//select[@id='Birthday_Day']"));
		 
		 Select select = new Select(DateofBirthDay);
		 
		 select.selectByIndex(10);
		 
		 WebElement DateofBirthMonth = driver.findElement(By.id("Birthday_Month"));
		 
		 select = new Select(DateofBirthMonth);
		 
		 select.selectByIndex(5);
	
		 WebElement DateofBirthYear = driver.findElement(By.id("Birthday_Year"));
		 
		 select = new Select(DateofBirthYear);
		 
		 select.selectByVisibleText("1993");
	 
		 driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
	
}
