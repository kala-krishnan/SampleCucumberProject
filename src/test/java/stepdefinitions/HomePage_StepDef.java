package stepdefinitions;

import org.openqa.selenium.WebDriver;

import applicationhooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePageObjects;
import pageobjects.registerPageObjects;

public class HomePage_StepDef {
	
	private WebDriver driver;
	HomePageObjects homePageObj;
	
	
	public HomePage_StepDef()
	{
		 driver = Hooks.getDriver();
		 homePageObj =  new HomePageObjects(driver);
	}

	@Given("The User opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		homePageObj.homePageLogin();
		
	}
	
	@When("The User clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		
		homePageObj.clickGetStartedButton();
	}
	
	@Then("The User should be redirected to homeage")
	public void the_user_should_be_redirected_to_homeage() {
		
		System.out.println("The User should be redirected to HomePage");
	}
	
	@Given(": The User is in HomePage")
	public void the_user_is_in_home_page() {
		homePageObj.homePage();
	}
	
	@When("The user Chooses {string} without login")
	public void the_user_chooses_without_login(String string) throws InterruptedException {
		homePageObj.checkSelectBox(string);
	}
	
	@Then("the user will get the {string}")
	public void the_user_will_get_the(String string) {
		System.out.println("The error message " +string);
	}
	
	

}
