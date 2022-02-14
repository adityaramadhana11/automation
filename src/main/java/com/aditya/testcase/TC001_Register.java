package com.aditya.testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aditya.objectrepository.HomePage;
import com.aditya.objectrepository.RegisterPage;

public class TC001_Register {
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
//		String Email = "test"+System.currentTimeMillis()+"@gmail.com";
		String Email = "adityaramadhana111@gmail.com";
		HomePage homePage = new HomePage(driver);
		RegisterPage registerPage = new RegisterPage(driver);
		homePage.clickDaftar();
		registerPage.inputTextEmail(Email);
		registerPage.clickDaftar();
		registerPage.clickYaKirimKode();
		Assert.assertEquals(registerPage.checkVerifikasi(), "Masukkan Kode Rahasia yang diterima via SMS di:");
	}
	@AfterTest
	public void driverClose(){
		driver.close();
	}
}