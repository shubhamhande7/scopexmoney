package pageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
  
	}
	
	@FindBy(xpath="//*[@id=\":r3:-form-item\"]")
	public WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\":r4:-form-item\"]")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/main/form/div[3]/button")
	WebElement btnSubmit;


	 public void setEmail(String email)
	 {
	    txtEmail.sendKeys(email);	
	 }
	 
	 public void setPassword(String password)
	 {
	   txtPassword.sendKeys(password);	
	 }
	 
	 public void clicklogin()
	 {
		 btnSubmit.click();
	 }
} 


