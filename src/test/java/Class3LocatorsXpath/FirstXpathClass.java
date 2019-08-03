package Class3LocatorsXpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstXpathClass {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		/*
		 * Xpath is one kind of locator
		 *
		 * 	there is two type of xpath 
		 * 
		 * 	one is single slash / 
		 * 
		 *  second one is double slash //
		 * 
		 * 
		 * 	single slash locator (absolute xpath) /  :
		 * 		
		 * 		- 
		 *  //*[@id="Wall"]/div/div[4]/div/main/section/div/div[1]/div/figure/a[1]
		 * 	/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/div/div/div[3]/div[1]/div[2]/button[2]/span
		 * 		
		 * 	Absolute xpath is basically finding the exact location of the element 
		 * 
		 * 
		 * 	double slash locator (relative xpath) //   : 
		 * 
		 * 	relative xpath is stating from anywhere in the website and finding the unique element 
		 * 		
		 * 			we can use parent child relationship and sibling relationship 
		 * 			
		 * 
		 */
		
		//double slash xpath 
		
		// parent and child 
		//  (   //button[@data-url='https://www.nike.com/w/mens-air-max-270-react-3oj2mznik1']//span[text()='Men']     )
		
		
		//  first element of the class 
		//  (//a[@class='product-card__link-overlay'])[1]
		
		
		
		
	}
	
}
