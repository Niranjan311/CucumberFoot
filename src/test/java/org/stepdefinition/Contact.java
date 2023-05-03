package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pages.ContactUsPage;

import io.cucumber.java.en.*;

public class Contact extends BaseClass{
	
	ContactUsPage cs = new ContactUsPage();
	
	@When("The user has to click contact us link")
	public void the_user_has_to_click_contact_us_link() {
	    
		btnClick(cs.getBtnContact());
		
	}

	@When("The user has to click How do I reach you by phone?")
	public void the_user_has_to_click_How_do_I_reach_you_by_phone() {
		
		btnClick(cs.getBtnCntPhn());
	    
	}

	@Then("The user has to naviagate to correct page")
	public void the_user_has_to_naviagate_to_correct_page() {
		
		String currentUrl = driver.getCurrentUrl();
		
		boolean contains = currentUrl.contains("How-do-I-reach-you-by-phone-");
		
		Assert.assertTrue(contains);
	    
	}

}
