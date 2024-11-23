package Capstone.AutomationPractice9;

import org.testng.annotations.Test;

import AmazonPages.Home;
import AmazonPages.Sign;
import Common.Utilities;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignToAmazon extends Utilities {
	
  @Test
  public void f() {
	  Home home = new Home(driver);
	  home.signField();
	  Sign sign = new Sign(driver);
	  sign.emailsendkeys();
	  sign.pwSendkeys();
  }
 	  
  

   }


