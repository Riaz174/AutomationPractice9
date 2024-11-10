package Capstone.AutomationPractice9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
	public static WebDriver driver;//WebDriver interface

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice9\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();//ChromeDriver class constructor
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		String windowhandle = driver.getWindowHandle();
		
		System.out.println(windowhandle);
		
		
	}

}
