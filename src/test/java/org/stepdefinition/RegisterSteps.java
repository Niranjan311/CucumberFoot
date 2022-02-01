package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.pages.RegistrationPage;

import io.cucumber.java.en.*;

public class RegisterSteps extends BaseClass {
	
	RegistrationPage r;

	@When("The user has to click sign in button and Create button")
	public void the_user_has_to_click_sign_in_button_and_Create_button() {
		r= new RegistrationPage();
		btnClick(r.getBtnSign());
		btnClick(r.getBtnCreate());
	    
	}
	@When("The user has to fill firstname, lastname and other fields")
	public void the_user_has_to_fill_firstname_lastname_and_other_fields() {
		
		r= new RegistrationPage();
				
		fillTextBox(r.getTxtFirstname(), "Niranjan");
		fillTextBox(r.getTxtLastname(), "kumar");
		fillTextBox(r.getTxtEmailId(), "kumar@gmail.com");
		fillTextBox(r.getTxtNewPassword(), "NiranjanK");

	}

	@When("The user has to click Signup button")
	public void the_user_has_to_click_Signup_button() {
		
		btnClick(r.getBtnSignUp());		

	}

	@Then("The user should receive error")
	public void the_user_should_receive_error() {
		
		String currentUrl = driver.getCurrentUrl();
		boolean contains = currentUrl.contains("create");
		Assert.assertTrue("to validate registration", contains);
		System.out.println("The user need to enter valid details");
		quitBrowser();

	}

}
