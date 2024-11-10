package Capstone.AutomationPractice9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice9\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		WebElement cnewaccount = driver.findElement(By.xpath("//*[contains(text(),'Create new account')]"));
		cnewaccount.click();
		Thread.sleep(6000);
		WebElement fnameField = driver.findElement(By.name("firstname"));
		fnameField.sendKeys("John");
		Thread.sleep(6000);
		WebElement lnameField = driver.findElement(By.name("lastname"));
		lnameField.sendKeys("Doe");
		Thread.sleep(6000);
		WebElement dayofbirth = driver.findElement(By.name("birthday_day"));
		Select od =new Select(dayofbirth);
		od.selectByIndex(9);
		Thread.sleep(6000);
		WebElement monthofbirth = driver.findElement(By.name("birthday_month"));
		Select om = new Select(monthofbirth);
		om.selectByVisibleText("Jan");
		Thread.sleep(3000);
		WebElement yearofbirth = driver.findElement(By.name("birthday_year"));
		Select oy = new Select(yearofbirth);
		oy.selectByValue("1953");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
		gender.click();
		
		
	}

}
