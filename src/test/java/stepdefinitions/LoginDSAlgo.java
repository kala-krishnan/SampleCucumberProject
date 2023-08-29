package stepdefinitions;

import org.openqa.selenium.WebDriver;

import applicationhooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPageObjects;

public class LoginDSAlgo {
	private WebDriver driver;
	LoginPageObjects Login_Page;
	public LoginDSAlgo()
	{
		driver = Hooks.getDriver();
		Login_Page =  new LoginPageObjects(driver);
	}
	
	@Given("The user opens the Login page")
	public void the_user_opens_the_login_page() {
		
		Login_Page.Login();
	}

	@When("The user clicks on the Login page with incorrect username and password")
	public void the_user_clicks_on_the_login_page_with_incorrect_username_and_password() {
		Login_Page.IncorrectUserNameAndPassword();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
		System.out.println("Error Message " +string);
	}


	@When("The user enters the correct username and password and clicks Login button")
	public void the_user_enters_the_correct_username_and_password_and_clicks_login_button() {
		Login_Page.CorrectUsernameAndPassword();
	}

	@Then("The user can see the  message {string}")
	public void the_user_can_see_the_message(String string) {
		System.out.println("Message ::" +string);
	}




}
