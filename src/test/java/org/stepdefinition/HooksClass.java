package org.stepdefinition;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class HooksClass extends BaseClass{
	
	@Before
	public void beforeScenario() throws IOException {
		
		launchBrowser("Chrome");
		implicitWait(20);		
		launchUrl(getPropertyValue("footUri"));
		System.out.println("------------Before Scenario----------");
	}
	
	@After
	public void afterScenario(Scenario sc) {
		
		if(sc.isFailed()) {
		TakesScreenshot t = (TakesScreenshot)driver;
		byte[] b = t.getScreenshotAs(OutputType.BYTES);
		sc.embed(b, "image/png");
		}
		quitBrowser();
		System.out.println("------------After Scenario----------");
		
	}

}
