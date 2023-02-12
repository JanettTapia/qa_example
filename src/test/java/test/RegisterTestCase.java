package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTestCase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		
		driver.get("https://www.advantageonlineshopping.com/#/register");
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Janett");
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Ch1234");
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Janett");
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Tapia");
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("3112145182");
		driver.findElement(By.name("countryListboxRegisterPage")).sendKeys("Mexico");
		driver.findElement(By.name("cityRegisterPage")).sendKeys("Tepic");
		driver.findElement(By.name("addressRegisterPage")).sendKeys("Datil");
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("Nayarit");
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("63197");
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("63197");
		driver.findElement(By.name("i_agree")).click();
		driver.findElement(By.id("register_btnundefined")).click();
	}

}
