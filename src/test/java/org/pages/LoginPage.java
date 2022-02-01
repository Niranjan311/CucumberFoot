package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement btnSign;
	
	@FindBy(name="uid")
	private WebElement txtUsername;
	
	@FindBy(name="password")
	private WebElement txtPassword;
	
	@FindBy(xpath ="(//button[text()='Sign In'])[2]")	
	private WebElement btnLogin;
	
	public WebElement getBtnSign() {
		return btnSign;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}
	
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	public WebElement getBtnLogin() {
		return btnLogin;
	
	}

}
