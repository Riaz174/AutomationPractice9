package Capstone.AutomationPractice9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windows {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository22\\AutomationPractice9\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement owindow = driver.findElement(By.id("openwindow"));
		owindow.click();
		String currentwindowhandle = driver.getWindowHandle();
		System.out.println(currentwindowhandle);
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String FirstWindowHandle = iterator.next();
		String SecondWindowHandle = iterator.next();
		System.out.println("This is FirstWindowHandle: " + FirstWindowHandle);
		System.out.println("This is SecondWindowHandle: " + SecondWindowHandle);
		driver.switchTo().window(SecondWindowHandle);
		WebElement courses = driver.findElement(By.linkText("Courses"));
		courses.click();
		
		
		
	}

}
