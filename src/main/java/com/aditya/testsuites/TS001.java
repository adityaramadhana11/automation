package com.aditya.testsuites;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aditya.testcasemobile.TCM001_Register;
import com.aditya.testcasemobile.TCM002_Login;
import com.aditya.testcasemobile.TCM003_Register_EmptyAllField;
import com.aditya.testcasemobile.TCM004_Register_IncorrectEmail;
import com.aditya.testcasemobile.TCM005_Register_PasswordNotMatch;
import com.aditya.testcasemobile.TCM006_Register_EmailAlreeadyUsed;
import com.aditya.testcasemobile.TCM007_Login_InvalidEmailFormat;
import com.aditya.testcasemobile.TCM008_Login_Invalid;

public class TS001 {
WebDriver driver;
String userDirectory = System.getProperty("user.dir");
String driverpath = userDirectory+"/datafiles/Sample Android App Login Test_v4.0_apkpure.com.apk";

	@BeforeTest
	public WebDriver setUp() throws MalformedURLException {
	    DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability("platformName", "Android");
	    cap.setCapability("platformVersion", "10");
	    cap.setCapability("deviceName","Pixel 4 API 29");
	    cap.setCapability("app", driverpath);
	    cap.setCapability("automationName", "UiAutomator2");
	    cap.setCapability("appPackage", "com.loginmodule.learning");
	    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    return driver;
	}


	@Test (priority=1)
	public void TC001() throws InterruptedException, MalformedURLException {
		TCM001_Register main = new TCM001_Register(driver);
		main.main();
	}
	@Test (priority=2)
	public void TC002() throws InterruptedException, MalformedURLException {
		TCM002_Login main = new TCM002_Login(driver);
		main.main();
		}
	@Test (priority=3)
	public void TC003() throws InterruptedException, MalformedURLException {
		TCM003_Register_EmptyAllField main = new TCM003_Register_EmptyAllField(driver);
		main.main();
		}
	@Test (priority=4)
	public void TC004() throws InterruptedException, MalformedURLException {
		TCM004_Register_IncorrectEmail main = new TCM004_Register_IncorrectEmail(driver);
		main.main();
		}
	@Test (priority=5)
	public void TC005() throws InterruptedException, MalformedURLException {
		TCM005_Register_PasswordNotMatch main = new TCM005_Register_PasswordNotMatch(driver);
		main.main();
		}
	@Test (priority=6)
	public void TC006() throws InterruptedException, MalformedURLException {
		TCM006_Register_EmailAlreeadyUsed main = new TCM006_Register_EmailAlreeadyUsed(driver);
		main.main();
		}
	@Test (priority=7)
	public void TC007() throws InterruptedException, MalformedURLException {
		TCM007_Login_InvalidEmailFormat main = new TCM007_Login_InvalidEmailFormat(driver);
		main.main();
		}
	@Test (priority=8)
	public void TC008() throws InterruptedException, MalformedURLException {
		TCM008_Login_Invalid main = new TCM008_Login_Invalid(driver);
		main.main();
		}
}
