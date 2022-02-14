package com.aditya.objectrepositorymobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage {
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void inputEmail(String text){
		driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/textInputEditTextEmail']")).sendKeys(text);
	}
	public void inputPassword(String text){
		driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/textInputEditTextPassword']")).sendKeys(text);
	}
	public void tapRegister() {
		driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/textViewLinkRegister']")).click();
	}
	public void tapLogin() {
		driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/appCompatButtonLogin']")).click();
	}
	public String verifikasiInvalidEmailFormat(){
		String verifikasiInvalidEmailFormat = driver.findElement(By.xpath("//*[@text = 'Enter Valid Email']")).getText();
		return(verifikasiInvalidEmailFormat);
	}
	public String verifikasiInvalidLogin(){
		String verifikasiInvalidLogin= driver.findElement(By.xpath("//*[@text='Wrong Email or Password']")).getText();
		return(verifikasiInvalidLogin);
	}
	
}
