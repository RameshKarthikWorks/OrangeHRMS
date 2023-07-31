package com.OrangeHRM.ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.OrangeHRM.Base.ProjectSpecifications;

public class WebPage_05_LogOutPage extends ProjectSpecifications {

	public WebPage_05_LogOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebPage_05_LogOutPage logOut() {
		WebElement profile = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']/ul/li"));

		profile.click();

		WebElement logoutButton = driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']/ul/li"));

		logoutButton.click();
		
		return this;
	}

}
