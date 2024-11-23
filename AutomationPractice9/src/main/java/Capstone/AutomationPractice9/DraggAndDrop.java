package Capstone.AutomationPractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggAndDrop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository22\\AutomationPractice9\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().parentFrame();
		WebElement dlog = driver.findElement(By.linkText("Dialog"));
		dlog.click();
		
	}

}
