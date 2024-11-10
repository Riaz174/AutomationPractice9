package Capstone.AutomationPractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice9\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement sbutton = driver.findElement(By.id("nav-search-submit-button"));
		sbutton.click();
		Thread.sleep(6000);
		WebElement tdeals = driver.findElement(By.linkText("Today's Deals"));
		tdeals.click();
		Thread.sleep(10000);
		WebElement sbox = driver.findElement(By.name("field-keywords"));
		sbox.sendKeys("Computer");
		Thread.sleep(3000);
		WebElement all = driver.findElement(By.linkText("All"));
		all.click();
		
				
;	}

}
