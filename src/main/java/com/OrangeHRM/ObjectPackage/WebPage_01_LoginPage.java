package com.OrangeHRM.ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.OrangeHRM.Base.ProjectSpecifications;

public class WebPage_01_LoginPage extends ProjectSpecifications {

	public WebPage_01_LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebPage_01_LoginPage userName() {
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));

		userName.sendKeys("Admin");

		return this;

	}

	public WebPage_01_LoginPage userPassword() {
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));

		passWord.sendKeys("admin123");

		return this;

	}

	public WebPage_02_Homepage logInButton() {
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));

		submit.click();

		return new WebPage_02_Homepage(driver);

	}

}
