package AmazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Facebook helps you connect and share with the people in your life.')]") WebElement text;
	@FindBy(name = "email") WebElement emailField;
	@FindBy(name = "pass") WebElement pword;
	@FindBy(name = "login")WebElement logField;
	public HomeOfFacebook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
public String verificationOfText() {
	String tx = text.getText();
	return tx;
}
public void emailSendkeys(String id) {
	emailField.sendKeys(id);
}
public void password(String id) {
	pword.sendKeys(id);
}
public void login() {
	logField.click();
	}
}


