package Capstone.AutomationPractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice9\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(20000);
		/*WebElement sbutton = driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/div/input"));
		sbutton.sendKeys("Computers");*/
		WebElement emailField = driver.findElement(By.xpath("//input[@type='text']"));
		emailField.sendKeys("john@gmail.com");
		Thread.sleep(6000);
		WebElement pword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pword.sendKeys("abcdef");
		Thread.sleep(6000);
		WebElement logbutton = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		logbutton.click();
		Thread.sleep(6000);
		WebElement fpassword = driver.findElement(By.xpath("//*[text()='Forgotten password?']"));
		fpassword.click();
		
				
		
	}

}
