package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps extends BaseClass { // footlocker
	
	LoginPage l;
	
	@When("The user has to click sign in button")
	public void the_user_has_to_click_sign_in_button() {		
		
		l= new LoginPage();		
		btnClick(l.getBtnSign());		
	
	}
	@When("The user has to fill username and password")
	public void the_user_has_to_fill_username_and_password() {
		
		fillTextBox(l.getTxtUsername(), "niranjank@gmail.com");		
		fillTextBox(l.getTxtPassword(), "niranjank");		
		
	}
	@When("The user has to fill {string} and {string}")
	public void the_user_has_to_fill_and(String user, String pass) {
		
		fillTextBox(l.getTxtUsername(), user);
		fillTextBox(l.getTxtPassword(), pass);

	}
	
	@When("The user has to click signin confirm button")
	public void the_user_has_to_click_signin_confirm_button() {
		
		btnClick(l.getBtnLogin());
			    
	}
	@Then("The user should navigate to invalid login page")
	public void the_user_should_navigate_to_invalid_login_page() {
		
		WebElement validate = driver.findElement(By.id("SignInErrors"));
		String text = validate.getText();
		boolean contains = text.contains("Please try again.");
		
		Assert.assertTrue("validate is user in valid or invalid page", contains);
		System.out.println("user need to reenter password");
		
		driver.quit();
	}
	

}
