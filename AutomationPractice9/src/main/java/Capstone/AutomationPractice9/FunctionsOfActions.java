package Capstone.AutomationPractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FunctionsOfActions {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository22\\AutomationPractice9\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement sign = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions action = new Actions(driver);
		action.moveToElement(sign).build().perform();
		Thread.sleep(6000);
		WebElement mlibrary = driver.findElement(By.linkText("Music Library"));
		action.moveToElement(mlibrary).click().build().perform();

		}

}
