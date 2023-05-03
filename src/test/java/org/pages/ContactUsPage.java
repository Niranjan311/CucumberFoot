package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BaseClass {

	public ContactUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement btnContact; 
	
	@FindBy(xpath="//a[contains(text(),'How do')]")
	private WebElement btnCntPhn;

	public WebElement getBtnContact() {
		return btnContact;
	}

	public WebElement getBtnCntPhn() {
		return btnCntPhn;
	}
	
	

}
