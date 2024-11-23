package AmazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public static WebDriver driver;
	@FindBy(name = "email") WebElement sign;
	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void signField() {
		sign.sendKeys("ali@gmail.com");
	}

}
