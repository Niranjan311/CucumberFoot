package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BaseClass {
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
		
	}
	
//	FaceBook WebElement 
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement btnSign;

	@FindBy(xpath="//a[contains(text(),'Create')]")
	private WebElement btnCreate;
		
	@FindBy(name="firstName")
	private WebElement txtFirstname;
	
	@FindBy(name="lastName")
	private WebElement txtLastname;
	
	@FindBy(name ="phoneNumber")	
	private WebElement numPhone;	
	
	@FindBy(name ="dateofbirthday")	
	private WebElement bdDay;
	
	@FindBy(name ="dateofbirthmonth")	
	private WebElement bdMonth;
	
	@FindBy(name ="dateofbirthyear")	
	private WebElement bdYear;
	
	@FindBy(name="uid")
	private WebElement txtEmailId;
	
	@FindBy(name ="password")	
	private WebElement txtNewPassword;
	
	@FindBy(xpath ="//button[@class='Button']")	
	private WebElement btnSignUp;
	
	public WebElement getBtnSign() {
		return btnSign;
	}
	
	public WebElement getBtnCreate() {
		return btnCreate;
	}
	
	public WebElement getTxtFirstname() {
		return txtFirstname;
	}
	
	public WebElement getTxtLastname() {
		return txtLastname;
	
	}
	public WebElement getNumPhone() {
		return numPhone;
	
	}
	public WebElement getNumDay() {
		return bdDay;
	
	}
	public WebElement getNumMonth() {
		return bdMonth;
	
	}
	public WebElement getNumYear() {
		return bdYear;
	
	}
	public WebElement getTxtEmailId() {
		return txtEmailId;
	
	}
	public WebElement getTxtNewPassword() {
		return txtNewPassword;
	
	}
	public WebElement getBtnSignUp() {
		return btnSignUp;
	
	}
	


}
