package com.OrangeHRM.ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.OrangeHRM.Base.ProjectSpecifications;

public class WebPage_02_Homepage extends ProjectSpecifications {
	
	
	public WebPage_02_Homepage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebPage_03_AddEmployeesPage pim()
	{
		
		WebElement pim = driver.findElement(By.xpath("//span[text()='PIM']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(pim).click().perform();
		
		return new WebPage_03_AddEmployeesPage(driver);
		
	}
	
	
	
	
	
	

}
