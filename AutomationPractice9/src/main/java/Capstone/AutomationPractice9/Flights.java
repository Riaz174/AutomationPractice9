package Capstone.AutomationPractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice9\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//WebElement flts = driver.findElement(By.xpath("(//*[text()='Flights'])[2]"));
		WebElement flts = driver.findElement(By.linkText("Flights"));
		flts.click();
		Thread.sleep(20000);
		WebElement dts = driver.findElement(By.name("EGDSDateRange-date-selector-trigger"));
		dts.click();
		Thread.sleep(6000);
		WebElement departdt = driver.findElement(By.xpath("(//div[@class='uitk-day-button uitk-day-selectable uitk-day-clickable'])[17]"));
		departdt.click();
		Thread.sleep(6000);
		


	}

}
