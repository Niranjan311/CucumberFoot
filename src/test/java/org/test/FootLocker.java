package org.test;

import java.util.concurrent.TimeUnit;
import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FootLocker extends BaseClass {
	
	
	public static void main(String[] args) {
		
		launchBrowser("Chrome");
		implicitWait(20);
		launchUrl("https://www.footlocker.com");
		
		LoginPage l= new LoginPage();
		
		btnClick(l.getBtnSign());
		fillTextBox(l.getTxtUsername(), "Kumar@gmail.com");
		fillTextBox(l.getTxtPassword(), "Niranjank");
		btnClick(l.getBtnLogin());
		
		WebElement txtPassword = l.getTxtPassword();
		
		String text = txtPassword.getText();
		
		System.out.println(text);
		
		
		driver.quit();
		
		
		
		
	}

}
