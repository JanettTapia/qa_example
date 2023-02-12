package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
					String appUrl = "https://www.advantageonlineshopping.com/#/";
					driver.get(appUrl);
					driver.manage().window().maximize();

					// Click on Popular Items link
					driver.findElement(By.xpath("(//a[contains(@href, 'javascript:void(0)')])[9]")).click();

					// Go back to Home Page
					driver.navigate().back();

					// Go forward to Registration page
					//driver.navigate().forward();

					// Go back to Home page
					//driver.navigate().to(appUrl);

					

	}

}
