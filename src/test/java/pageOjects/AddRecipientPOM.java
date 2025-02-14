package pageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRecipientPOM {

	public WebDriver driver;
	public AddRecipientPOM(WebDriver driver){
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//span[text()=\"Recipients\"]")
	public WebElement Recipient;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/aside/div/ul/li[4]/ul/li[2]/a")
	public WebElement AddRecipient;
	

	@FindBy(xpath="//input[@placeholder=\"Enter recipient name\"]")
	public WebElement Recipientname;
	
	
	@FindBy(xpath="//input[@placeholder=\"Enter recipient nick name\"]")
	public WebElement Recipientnickn;
	
	@FindBy(xpath="//input[@placeholder=\"Enter bank account number\"]")
	public WebElement  Accountnumber;
	
	
	@FindBy(xpath="//input[@placeholder=\"Enter IFSC code\"]")
	public WebElement  IFSC;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement  Submit;
	
	
	@FindBy(xpath="//a[@href='https://scopex.money']//following::div[1]/div/button")
	public WebElement Circle;
	

	@FindBy(xpath="//a[@id=\"menu-item-1\"]")
	public WebElement Logout;
	
	
	
	public void recipient() {
		Recipient.click();
	}
	
	
		public void addRecipient() {
			AddRecipient.click();
	}
		
		public void recipientname(String Recipientname) {
			this.Recipientname.sendKeys(Recipientname);
		
	}
		
		public void recipientnickn(String Recipientnickn) {
			this.Recipientnickn.sendKeys(Recipientnickn);
		
	}
		public void accountnumber(String Accountnumber) {
			this.Accountnumber.sendKeys(Accountnumber);
		
	}
		
		public void iFSC(String iFSC) {
			this.IFSC.sendKeys(iFSC);
		
	}
		
		public void Circle() {
			Circle.click();
		}
		
		public void logout() {
			Logout.click();
		}
		
}
