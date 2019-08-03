package Class4RadioButtonCheckbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.runtime.Timeout;

public class RadioButton {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement inputElement = driver.findElement(By.xpath("//input[contains(@id,'search')]"));
		 
//		searching teddy bear
		inputElement.sendKeys("teddy bear");
		
		WebElement SearchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
		
//		clicking on search button
		SearchButton.click();
		  
		WebElement input_anyWhere = driver.findElement(By.xpath("//span[contains(text(),'Anywhere')]"));
		
		WebElement input_UnitedStates = driver.findElement(By.xpath("//span[contains(text(),'United States')]"));
		
		WebElement input_HandMade = driver.findElement(By.xpath("//label[contains(text(),'Handmade')]"));
		 
		WebElement input_under50= driver.findElement(By.xpath("//span[contains(text(),'Under $50')]"));
		 
		WebElement input_between200_250= driver.findElement(By.xpath("//span[contains(text(),'$200 to $250')]"));
		
//		click on united stated radio button
		input_UnitedStates.click();
		
		System.out.println("united states clicking ");
		
		WebElement input_Vintage = driver.findElement(By.xpath("//label[contains(text(),'Vintage')]"));
		
//		click on vintage radio button 
		input_Vintage.click();
		
		System.out.println("input vintage clicking");
	
		WebElement input_between50_200= driver.findElement(By.xpath("//span[contains(text(),'$50 to $200')]"));
		
//		click on between 50_200 radio button 
		input_between50_200.click();
		 
		System.out.println("input 50_200 clicking");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		inputElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'search')]")));
		
		inputElement.clear();
		
		inputElement.sendKeys("frog pillow");
		
		SearchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Search']")));
		
		SearchButton.click();
	
		
		
	}
}
