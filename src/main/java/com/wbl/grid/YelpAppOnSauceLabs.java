package com.wbl.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class YelpAppOnSauceLabs {
	

	// ypou get the USERNAME AND AUTOMATE_KEY (Access Key) from the browserstack
	// dashboard when you go to 'Automate'

	public static final String USERNAME = "palsj";
	public static final String AUTOMATE_KEY = "482cc9da-786b-4617-9ce5-f3ca0dd776ac";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.saucelabs.com:443/wd/hub";

  	 
 //	 static  AppiumDriver<AndroidElement> driver;
	
//	@Test	
//	 public void before() throws MalformedURLException{
	
	
	public static void main(String arg[]) throws MalformedURLException, InterruptedException {

	 
 	   
//		   String apkFilePath = System.getProperty("user.dir")+"\\resources\\yelp.apk";
	   
	   
	    
	    DesiredCapabilities dc = new DesiredCapabilities();
	    dc.setCapability("platformName", "Android");
	    dc.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
	    dc.setCapability("platformVersion", "4.4");
 	    dc.setCapability("browserName", "");
	    dc.setCapability("deviceOrientation", "portrait");
	    dc.setCapability("appiumVersion", "1.6.4");
	    
	    dc.setCapability("app", "https://www.dropbox.com/s/42lmxcz8rpn8pee/yelp.apk?dl=0");
	    
 	    

	 
	    WebDriver  driver = new AndroidDriver<WebElement>(new URL(URL), dc);
	 
  	      
		 
		    System.out.println("after creating driver");


	//	driver.unlockDevice();
		    
		   
		driver.findElement(By.xpath("//android.widget.Button[@text='Get Started!']")).click();
		
	//	driver.findElementByXPath("//android.widget.Button[@text='Get Started!']").click();;
        Thread.sleep(3000);
  //      driver.findElementByName("First Name").sendKeys("Pallavi");
        driver.findElement(By.name("First Name")).sendKeys("Pallavi");
        
   //     driver.findElementById("com.yelp.android:id/last_name").sendKeys("Jadhav");
        driver.findElement(By.id("com.yelp.android:id/last_name")).sendKeys("Jadhav");
        Thread.sleep(3000);

        driver.hideKeyboard();
        Thread.sleep(3000);

  //      driver.lockDevice();
        driver.removeApp("yelp.apk");
        driver.closeApp();
        
	}
	
/*	
	public void testTouchAction() {
		
		TouchAction action = new TouchAction(driver);
		WebElement ele = driver.findElementByName("First Name");
		action.longPress(driver.findElementByName("First Name"));
		action.tap(ele);
	 	
	}
	
	*/

}
