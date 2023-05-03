package org.stepdefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Time;
import java.time.Duration;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.runtime.Timeout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Amazon extends BaseClass {

	@Given("user is in login screen")
	public void user_is_in_login_screen() throws InterruptedException {
		launchBrowser("Chrome");
		launchUrl("https://www.amazon.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();

	}

	@When("user enter username and password and click login")
	public void user_enter_username_and_password_and_click_login(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   
		List<List<String>> asLists = dataTable.asLists();
		
		for (int i = 0; i < asLists.size(); i++) {
			
			List<String> list = asLists.get(i);
						
			System.out.println(list.get(0));
			System.out.println(list.get(1));
		
			WebElement txtEmail = driver.findElement(By.xpath("//input[@id='ap_email']"));
			txtEmail.sendKeys(list.get(0));
			
			
			Thread.sleep(5000);
			
			txtEmail.clear();
			System.out.println(" ");
		}	
		
	}
	
	@When("user enter {string} and {string} and click login")
	public void user_enter_and_and_click_login(String user, String pass) throws IOException {
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='ap_email']"));
		txtEmail.sendKeys(user,Keys.ENTER);
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='ap_password']"));
		txtPass.sendKeys(pass,Keys.ENTER);
		
		
		
	}

}
