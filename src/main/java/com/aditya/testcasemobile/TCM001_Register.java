package com.aditya.testcasemobile;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aditya.objectrepositorymobile.LoginPage;
import com.aditya.objectrepositorymobile.RegisterPage;

import java.net.URL;

public class TCM001_Register {
String userDirectory = System.getProperty("user.dir");
String driverpath = userDirectory+"/datafiles/Sample Android App Login Test_v4.0_apkpure.com.apk";
WebDriver driver;
String Name = "test";
public static String Email = "test"+System.currentTimeMillis()+"@test.com";
String Password = "test";
String ConfirmPassword = "test";



		public TCM001_Register(WebDriver driver) {
			this.driver = driver;
		}

		@BeforeTest
	    public void setUp() throws MalformedURLException {
	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability("platformName", "Android");
	        cap.setCapability("platformVersion", "10");
	        cap.setCapability("deviceName","Pixel 4 API 29");
	        cap.setCapability("app", driverpath);
	        cap.setCapability("automationName", "UiAutomator2");
	        cap.setCapability("appPackage", "com.loginmodule.learning");
	        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    }
	    
	    @Test
	    public void main() throws InterruptedException {
	    	LoginPage loginPage = new LoginPage(driver);
	    	RegisterPage registerPage = new RegisterPage(driver);
	    	loginPage.tapRegister();
	    	Thread.sleep(2000);
	    	registerPage.inputName(Name);
	    	registerPage.inputEmail(Email);
	    	registerPage.inputPassword(Password);
	    	registerPage.inputConfirmPassword(ConfirmPassword);
	    	registerPage.tapRegister();
	    	Thread.sleep(2000);
	    	Assert.assertEquals(registerPage.verifikasiText(), "Registration Successful");
	    	driver.navigate().back();
	    	System.out.println(TCM001_Register.Email);
	    }
		
		
}
