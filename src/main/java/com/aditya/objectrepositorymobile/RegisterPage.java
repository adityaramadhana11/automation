package com.aditya.objectrepositorymobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	WebDriver driver;
	WebDriverWait wait;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void inputName(String text){
		driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/textInputEditTextName']")).sendKeys(text);
	}
	public String inputEmail(String text){
		driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/textInputEditTextEmail']")).sendKeys(text);
		String Email = text;
		return Email;
	}
	public void inputPassword(String text){
		driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/textInputEditTextPassword']")).sendKeys(text);
	}
	public void inputConfirmPassword(String text){
		driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/textInputEditTextConfirmPassword']")).sendKeys(text);
	}
	public void tapRegister(){
		driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/appCompatButtonRegister']")).click();
	}
	public String verifikasiText(){
		String registersuccess = driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/snackbar_text'and @text = 'Registration Successful']")).getText();
		return(registersuccess);
	}
	public String verifikasiTextEnterName(){
		String verifikasiTextEnterName = driver.findElement(By.xpath("//*[@text = 'Enter Full Name']")).getText();
		return(verifikasiTextEnterName);
	}
	public String verifikasiTextIncorrectEmail(){
		String verifikasiTextIncorrectEmail = driver.findElement(By.xpath("//*[@text = 'Enter Valid Email']")).getText();
		return(verifikasiTextIncorrectEmail);
	}
	public String verifikasiTextPasswordNotMatch(){
		String verifikasiTextPasswordNotMatch = driver.findElement(By.xpath("//*[@text = 'Password Does Not Matches']")).getText();
		return(verifikasiTextPasswordNotMatch);
	}
	public String verifikasiTextEmailAlreadyExist(){
		String verifikasiTextEmailAlreadyExist = driver.findElement(By.xpath("//*[@text = 'Email Already Exists']")).getText();
		return(verifikasiTextEmailAlreadyExist);
	}
}
