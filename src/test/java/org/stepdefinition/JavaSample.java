package org.stepdefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaSample {
	public static final String AUTOMATE_USERNAME = "niranjankumar_HL5ReN";
	public static final String AUTOMATE_ACCESS_KEY = "svbALqgXPMYgXujxsUp7";
	public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY
			+ "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "10");
		caps.setCapability("resolution", "1920x1080");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "95.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("name", "BStack Cloud"); // test name
		caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("https://www.footlocker.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement btnSign = driver.findElement(By.xpath("//button[@type='button']"));
		btnSign.click();
		
		WebElement txtUser = driver.findElement(By.name("uid"));
		txtUser.sendKeys("niranjank311294@gmail.com");
		
		WebElement txtpass = driver.findElement(By.name("password"));
		txtpass.sendKeys("Niranjan@31");
		
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@class='Button'])[3]"));
		btnlogin.click();
		
		driver.quit();
}
}