package com.wbl.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserStackGridExample {
	
	// ypou get the USERNAME AND AUTOMATE_KEY (Access Key) from the browserstack dashboard when you go to 'Automate'
	
	public static final String USERNAME = "palsj1";
	public static final String AUTOMATE_KEY = "3MfoM7bZXZ6Cstky4sPo";
	public static final String URL = "https://"+ USERNAME + ":"+ AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
 	
	@Test
	public void testBrowserStack() throws MalformedURLException {
		
 // we can specify browserr name either of the following 2 ways		
		
	/*	DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("browser", "chrome");*/
		
	 	DesiredCapabilities dc = DesiredCapabilities.chrome();

		dc.setPlatform(Platform.WINDOWS);
		dc.setCapability("browserstack.debug", "true");
		dc.setCapability("build", "Second build");
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), dc);
		
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("browserstack");
		element.submit();
		
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}
	
	
	@Test
	public void testBrowserStack1() throws MalformedURLException {
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("browser", "firefox");
		dc.setPlatform(Platform.MAC);
		dc.setCapability("browserstack.debug", "true");
		dc.setCapability("build", "Second build");
		
		WebDriver driver = new RemoteWebDriver(new URL(URL), dc);
		
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("browserstack");
		element.submit();
		
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}

}
