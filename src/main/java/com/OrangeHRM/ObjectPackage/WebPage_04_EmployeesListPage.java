package com.OrangeHRM.ObjectPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.OrangeHRM.Base.ProjectSpecifications;

public class WebPage_04_EmployeesListPage extends ProjectSpecifications {
	
	
	public WebPage_04_EmployeesListPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebPage_04_EmployeesListPage employeelistMenu()
	{
		driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		return this;
	}

	public WebPage_05_LogOutPage viewEmployeelist()
	{
		
	
		List <WebElement> employeeslist = driver.findElements(By.xpath("//div[@class='oxd-table-card']/div/child::div[3]/div"));
		
		
		
		for (WebElement employee : employeeslist) {
			
			String nameofemployee=employee.getText();
			
			if(nameofemployee.equals("Aravindh Kumar") || nameofemployee.equals("Bharkavi Sathya") || nameofemployee.equals("Dharani Shruthi")) 
			{
				Actions act = new Actions(driver);
				
				act.scrollToElement(employee).perform();
				
				System.out.println(nameofemployee);
			}
			
	
		}
		
		return new WebPage_05_LogOutPage(driver);
		
	}

}
