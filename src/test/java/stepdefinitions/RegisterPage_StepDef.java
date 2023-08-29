package stepdefinitions;

import org.openqa.selenium.WebDriver;

import applicationhooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.registerPageObjects;

public class RegisterPage_StepDef {
	
	registerPageObjects register_Page;
	private WebDriver driver;
	public RegisterPage_StepDef()
	{
		//WebDriverManager.chromedriver().driverVersion("114.0.5735.90").setup();
		
		 driver = Hooks.getDriver();
		register_Page =  new registerPageObjects(driver);
	}

@Given("The user opens Register page")
public void the_user_opens_register_page() {
	register_Page.registerLogin();
}

@When("The user clicks {string} button with all fields empty")
public void the_user_clicks_button_with_all_fields_empty(String string) {
	register_Page.clickWithoutGivingUserNameAndPassword();
}

@Then("It should display an error {string}")
public void it_should_display_an_error(String string) {

System.out.println("The error message is  "+string);

}

@When("The user clicks {string} button after giving username with other fields empty")
public void the_user_clicks_button_after_giving_username_with_other_fields_empty(String string) {
	register_Page.clickWithoutGivingPasswords();
}

@Then("It should throws an error {string}")
public void it_should_throws_an_error(String string) {
	System.out.println("The error message is  "+string);
}

@When("The user clicks {string} button after giving the username and password with password confirmation field empty")
public void the_user_clicks_button_after_giving_the_username_and_password_with_password_confirmation_field_empty(String string) {
	register_Page.clickWithoutGivingConfirmPassword();
}

@Then("The user can see the error message {string}")
public void the_user_can_see_the_error_message(String string) {
	System.out.println("The error message is  "+string);
}

@When("The user enters {string}, {string}, and {string}")
public void the_user_enters_and(String string, String string2, String string3) {
	register_Page.clickafterGivingInvalidCredentials(string, string2, string3);
}

@When("the user clicks the register button")
public void the_user_clicks_the_register_button() {
register_Page.clickRegisterButton();
}

@Then("the user should see the error message indicating {string}")
public void the_user_should_see_the_error_message_indicating(String string) {
System.out.println("output ::"+string);
}

}
