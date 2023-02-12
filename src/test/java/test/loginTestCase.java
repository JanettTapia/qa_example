package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		
		WebElement customer_icon=driver.findElement(By.xpath("//*[@id=\"menuUser\"]"));
		customer_icon.click();
		driver.findElement(By.name("username")).sendKeys("stapiajob@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ch1234");
		driver.findElement(By.id("sign_in_btnundefined")).click();
	}

}
