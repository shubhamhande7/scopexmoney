package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageOjects.AddRecipientPOM;
import utilities.Utility;

public class AddRecipientSteps {
	WebDriver driver;
	AddRecipientPOM rec;

	@Given("User click on Recipients Dropdown and click on Recipient list")
	public void user_click_on_recipients_dropdown_and_click_on_recipient_list() {
		this.driver = LoginStepDemo.getDriver();
		rec = new AddRecipientPOM(driver);
		rec.Recipient.click();
		Utility.waait(5);
	}

	@When("click on AddRecipient")
	public void click_on_add_recipient() {
		rec.AddRecipient.click();
		Utility.waait(3);
	}

	@When("the user enters the Recipient Name {string}")
	public void the_user_enters_the_recipient_name(String Recipientname) {
		rec.Recipientname.sendKeys(Recipientname);
	}

	@When("the user enters the Recipient Nick Name {string}")
	public void the_user_enters_the_recipient_nick_name(String Recipientnickn) {
		rec.Recipientnickn.sendKeys(Recipientnickn);
	}

	@When("the user enters the Bank Account Number {string}")
	public void the_user_enters_the_bank_account_number(String Accountnumber) {
		rec.Accountnumber.sendKeys(Accountnumber);
	}

	@When("the user enters the IFSC Code {string}")
	public void the_user_enters_the_ifsc_code(String IFSC) {
		rec.IFSC.sendKeys(IFSC);
		Utility.waait(3);
	}

	@Then("the click on Submit button")
	public void the_click_on_submit_button() {

		Utility.scroll(rec.Submit);
		Utility.waait(3);

	}

	@Given("Click on profile")
	public void click_on_profile() {
		this.driver = LoginStepDemo.getDriver();
		rec = new AddRecipientPOM(driver);
		Utility.waait(10);
		rec.Circle.click();
		Utility.waait(2);
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() {
		rec.Logout.click();
	}

	@Then("User should be logout")
	public void user_should_be_logout() {

	}

}
