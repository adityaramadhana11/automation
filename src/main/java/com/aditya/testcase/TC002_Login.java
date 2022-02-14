package com.aditya.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aditya.objectrepository.HomePage;
import com.aditya.objectrepository.LoginPage;
public class TC002_Login {
String driverPath = "./datafiles/chromedriver.exe";  
WebDriver driver;

	@BeforeTest
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://bukalapak.com");
	}
	@Test
	public void main(){
		String Email = "adityaramadhana111@gmail.com";
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		homePage.clickLogin();
		loginPage.inputEmail(Email);
		loginPage.clickLogin();
		Assert.assertEquals(loginPage.checkLogin(), "Masukkan Kode Rahasia yang diterima via email di:");
	}
	@AfterTest
	public void driverClose(){
		driver.close();
	}
}