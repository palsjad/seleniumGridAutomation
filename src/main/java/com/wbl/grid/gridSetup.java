package com.wbl.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gridSetup {

  WebDriver driver;
	String baseURL,  nodeURL;


	@BeforeTest
	public void setUp()   throws MalformedURLException  {

	//  driver = null;

	 	baseURL = "http://www.google.com";
		  nodeURL = "http://127.0.0.1:5555/wd/hub";    // get this from the node window "remoteWebDriver instances should connect to ........"



	//	System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\seleniumGridAutomation\\resources\\chromedriver.exe");


		DesiredCapabilities dc = DesiredCapabilities.chrome();
	 	dc.setBrowserName("chrome");

		dc.setPlatform(Platform.VISTA); 

	//	WebDriver driver;
  		driver = new RemoteWebDriver(new URL(nodeURL), dc);

		/*

//		 **************************************************************************************************	  

		we can write the above in either of the 2 ways given below  
 	    dc.setBrowserName("chrome");
		    dc.setCapability("browser", "chrome");

	 	 DesiredCapabilities dc = new DesiredCapabilities();
	    	dc.setCapability("browser", "chrome"); 
	//	 ***************************************************************************************************	  	

		System.setProperty("webdriver.gecko.driver", "C:\\QA\\EclipseWorkspace\\seleniumGridAutomation\\resources\\newGeckodriver.exe");

        FirefoxOptions options = new FirefoxOptions();

		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine

	 	DesiredCapabilities dc =  DesiredCapabilities.firefox();
	    dc.setBrowserName("firefox");
		dc.setPlatform(Platform.WINDOWS); 


		 */ 

	}


	@Test 
	public void getTitle() { 




		driver.get(baseURL);
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("browserstack");
		element.submit();

		System.out.println(driver.getTitle());

	}

	@AfterTest
	public void afterTest() {
		//		driver.quit();

		System.out.println("after test");

	}



}
