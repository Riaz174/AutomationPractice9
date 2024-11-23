package AmazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public static WebDriver driver;
	@FindBy(name = "email") WebElement email;
	@FindBy(id = "pass") WebElement pwbutton;
	public Sign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void emailsendkeys() {
		email.sendKeys("Doe@gmail.com");
	}
	public void pwSendkeys() {
		pwbutton.sendKeys("Defender");
		
		
	}

}
