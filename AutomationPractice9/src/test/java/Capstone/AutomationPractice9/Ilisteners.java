package Capstone.AutomationPractice9;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Utilities;

public class Ilisteners extends Utilities implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		this.driver = ((Utilities)result.getInstance()).driver;
		Date is = new Date(); 
		System.out.println(is);
		String sd = is.toString().replace(" " , "_").replace(":", "_");
		System.out.println(sd);
		File ks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(ks,new File("C:\\Users\\riaz_\\git\\repository22\\AutomationPractice9\\Pictures\\Pass\\"+sd+"pictureofwebsite.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}

	@Override
	public void onTestFailure(ITestResult result) {
		this.driver = ((Utilities)result.getInstance()).driver;
		Date is = new Date(); 
		System.out.println(is);
		String sd = is.toString().replace(" " , "_").replace(":", "_");
		System.out.println(sd);
		File ks = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(ks,new File("C:\\Users\\riaz_\\git\\repository22\\AutomationPractice9\\Pictures\\Failed\\"+sd+"pictureofwebsite.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			}
	

}
