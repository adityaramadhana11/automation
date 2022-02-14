package com.aditya.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	WebDriver driver;
	WebDriverWait wait;


	@SuppressWarnings("deprecation")
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, 80);
	}
	
	public void inputTextEmail(String text){
		driver.findElement(By.xpath("//div[@class='bl-text-field__inner']/input[@class='bl-text-field__input']")).sendKeys(text);	
	}
	
	public void clickDaftar() {
		driver.findElement(By.xpath("//span[@class = 'bl-text bl-text--body-default bl-text--semi-bold bl-text--inverse']")).click();;
	}
	public void clickYaKirimKode() {
		driver.findElement(By.xpath("//span[text()='Ya, kirim kode']")).click();
	}
	public String checkVerifikasi() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/div[@class='bl-flex-item']/p[text()='Masukkan Kode Rahasia yang diterima via email di:' or text()='Akun sudah terdaftar']")));
		String checkVerifikasi = driver.findElement(By.xpath("//div/div[@class='bl-flex-item']/p[text()='Masukkan Kode Rahasia yang diterima via email di:' or text()='Akun sudah terdaftar']")).getText();
		return(checkVerifikasi);
	}
}