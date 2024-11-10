package Capstone.AutomationPractice9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice9\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement cusid = driver.findElement(By.name("cusid"));
		cusid.sendKeys("53920");
		WebElement subbutton = driver.findElement(By.name("submit"));
		subbutton.click();
		Alert alert = driver.switchTo().alert();
		//Capturing alert message.
		String alertMessage = driver.switchTo().alert().getText();
		//Display alert message
		System.out.println(alertMessage);
		Thread.sleep(6000);
		//Accepting alert
		alert.accept();
	}

}
