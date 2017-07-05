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

public class SauceLabsGridExample {
	
//	482cc9da-786b-4617-9ce5-f3ca0dd776ac
	
	// ypou get the USERNAME AND AUTOMATE_KEY (Access Key) from the browserstack dashboard when you go to 'Automate'
	
		public static final String USERNAME = "palsj";
		public static final String AUTOMATE_KEY = "482cc9da-786b-4617-9ce5-f3ca0dd776ac";
		public static final String URL = "https://"+ USERNAME + ":"+ AUTOMATE_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 	
		@Test
		public void testSauceLabs() throws MalformedURLException {
						
		/*	DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("browser", "chrome"); 
			dc.setPlatform(Platform.WINDOWS);
	//		dc.setCapability("browserstack.debug", "true");
			dc.setCapability("build", "Second build");
			*/
			

		    DesiredCapabilities dc = DesiredCapabilities.chrome();
		    dc.setCapability("platform", "Windows");
	//	    dc.setCapability("version", "43.0");
		 
 			WebDriver driver = new RemoteWebDriver(new URL(URL), dc);
			
			driver.get("http://www.google.com");
			WebElement element = driver.findElement(By.id("lst-ib"));
			element.sendKeys("saucelabs");
			element.submit();
			
			System.out.println(driver.getTitle());
			driver.quit();			
			
			
		}
		
		
		@Test
		public void testSauceLabs1() throws MalformedURLException {
			
	/*		
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("browser", "firefox");
			dc.setPlatform(Platform.MAC);
	//		dc.setCapability("browserstack.debug", "true");
			dc.setCapability("build", "Second build");
			*/
			
			DesiredCapabilities dc = DesiredCapabilities.firefox();
		    dc.setCapability("platform", "MAC");
	//	    dc.setCapability("version", "43.0");
		 
			
			WebDriver driver = new RemoteWebDriver(new URL(URL), dc);
			
			driver.get("http://www.google.com");
			WebElement element = driver.findElement(By.id("lst-ib"));
			element.sendKeys("saucelabs");
			element.submit();
			
			System.out.println(driver.getTitle());
			driver.quit();
			
			
			
		}

	}
