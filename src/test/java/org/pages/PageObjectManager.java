package org.pages;

public class PageObjectManager {
	
	public PageObjectManager() {
		
	}
	private static PageObjectManager manager;
	private LoginPage loginPage;
	private RegistrationPage registerationPage;
	
	public static PageObjectManager getManager() {
		
		return manager==null?manager =new PageObjectManager():manager;
	}
	public LoginPage getLoginPage() {
		return loginPage==null?loginPage= new LoginPage():loginPage;
	}
	public RegistrationPage getRegisterationPage() {
		return registerationPage==null? registerationPage=new RegistrationPage():registerationPage;
	}
	
	

}
