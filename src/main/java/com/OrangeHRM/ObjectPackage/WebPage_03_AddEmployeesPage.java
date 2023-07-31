package com.OrangeHRM.ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.OrangeHRM.Base.ProjectSpecifications;

public class WebPage_03_AddEmployeesPage extends ProjectSpecifications {

	public WebPage_03_AddEmployeesPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebPage_04_EmployeesListPage createEmployee(String firstName1, String middleName1 , String lastName1, String EmployeeID1) {

		WebElement addEmployeeButton = driver.findElement(By.xpath("(//ul)[3]/li[3]/a[text()='Add Employee']"));

		addEmployeeButton.click();

		WebElement firstNametext = driver.findElement(By.xpath("//input[@name='firstName']"));

		firstNametext.sendKeys(firstName1);

		WebElement middleName = driver.findElement(By.xpath("//input[@name='middleName']"));

		middleName.sendKeys(middleName1);

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));

		lastName.sendKeys(lastName1);

		WebElement employeeID = driver.findElement(By.xpath("//label[text()='Employee Id']/following::input[1]"));

		employeeID.sendKeys(EmployeeID1);

		WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit']"));

		saveButton.click();
		
		return new WebPage_04_EmployeesListPage(driver);

	}



}
