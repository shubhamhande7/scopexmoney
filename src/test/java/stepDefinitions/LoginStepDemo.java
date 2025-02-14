package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageOjects.LoginPage;

public class LoginStepDemo {

	static WebDriver driver;
	LoginPage lp;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		driver.get(string);

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String Email, String Password) {
		lp = new LoginPage(driver);
		lp.setEmail(Email);
		lp.setPassword(Password);

	}

	@Then("Click on Login")
	public void click_on_login() {
		lp.clicklogin();
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
