package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import stepDefinitions.LoginStepDemo;

public class Utility {
	WebDriver driver;
	public static void selectDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public static void waait(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException shubham) {

		}
		
	
	}
	
	public static void scroll(WebElement ele) {
		JavascriptExecutor js= ((JavascriptExecutor)LoginStepDemo.getDriver());
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
			
	}

}