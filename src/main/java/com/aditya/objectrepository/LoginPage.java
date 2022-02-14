package com.aditya.objectrepository;

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
		driver.findElement(By.id("LoginID")).sendKeys(text);	
	}
	public void clickLogin(){
		driver.findElement(By.id("submit_button")).click();	
	}
	public String checkLogin() {
		String checkLogin = driver.findElement(By.xpath("//div[@class='bl-flex-item']/p[@class='mb-16 bl-text bl-text--subheading-3 bl-text--semi-bold']")).getText();
		return(checkLogin);
	}
}