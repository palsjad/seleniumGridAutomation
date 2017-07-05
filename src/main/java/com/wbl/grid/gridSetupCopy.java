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

public class gridSetupCopy {
	
	
	
//	WebDriver driver;
	public static final String URL  = "http://127.0.0.1:5555/wd/hub";  
	// get this from the node window "remoteWebDriver instances should connect to ........"


	@Test
	public void setup() throws MalformedURLException {

		// 	DesiredCapabilities dc =  DesiredCapabilities.firefox();

		//		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		//		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");

		/*		System.setProperty("webdriver.chrome.driver",
  				System.getProperty("C:\\QA\\EclipseWorkspace\\seleniumGridAutomation\\resources\\chromedriver.exe"));*/

		DesiredCapabilities dc =  DesiredCapabilities.chrome();

		/*	DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("browser", "chrome");*/

		// either write it the above way or do the below

		//     dc.setBrowserName("firefox");

		//     dc.setBrowserName("chrome");

		//	dc.setCapability("browser", "chrome");


		dc.setPlatform(Platform.WINDOWS); 

		WebDriver driver = null;

		driver = new RemoteWebDriver(new URL(URL), dc);


		//		WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:5555/wd/hub"),dc); // get this ip address either from 
		// the command window wherer you start the node or from the console 

		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("browserstack");
		element.submit();

		System.out.println(driver.getTitle());
		driver.quit();



	}


}
