package com.aditya.objectrepositorymobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String verifikasiTextName(){
		String verifikasiTextName = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[2]")).getText();
		return(verifikasiTextName);
		
	}
	public String verifikasiTextEmail(){
		String verifikasiTextEmail = driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/textViewEmail']")).getText();
		return(verifikasiTextEmail);
	}
	public String verifikasiTextPassword(){
		String verifikasiTextPassword= driver.findElement(By.xpath("//*[@resource-id = 'com.loginmodule.learning:id/textViewPassword']")).getText();
		return(verifikasiTextPassword);
	}
}
