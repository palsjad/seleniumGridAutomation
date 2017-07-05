package com.wbl.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
 

public class MobileAppOnGrid {

	// ypou get the USERNAME AND AUTOMATE_KEY (Access Key) from the browserstack
	// dashboard when you go to 'Automate'

	public static final String USERNAME = "palsj";
	public static final String AUTOMATE_KEY = "482cc9da-786b-4617-9ce5-f3ca0dd776ac";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.saucelabs.com:443/wd/hub";

  	 

	public static void main(String arg[]) throws MalformedURLException {
		
		   DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability("platformName", "Android");
		    capabilities.setCapability("deviceName", "Samsung Galaxy S4 Emulator");
		    capabilities.setCapability("platformVersion", "4.4");
		    capabilities.setCapability("app", "http://saucelabs.com/example_files/ContactManager.apk");
		    capabilities.setCapability("browserName", "");
		    capabilities.setCapability("deviceOrientation", "portrait");
		    capabilities.setCapability("appiumVersion", "1.5.3");
		    
		    WebDriver driver = new AndroidDriver<WebElement>(new URL(URL), capabilities);
	}

	 

}
