package com.aditya.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void clickDaftar(){
		driver.findElement(By.xpath("//p[@class='pr-4 sigil-header__nav-action bl-text bl-text--body-small bl-text--semi-bold' and text()='Daftar']")).click();
	}
	public void clickLogin() {
		driver.findElement(By.xpath("//p[@class='pr-4 sigil-header__nav-action bl-text bl-text--body-small bl-text--semi-bold' and text()='Login']")).click();
	}
}
