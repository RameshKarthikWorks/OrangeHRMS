package com.OrangeHRM.TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OrangeHRM.Base.ProjectSpecifications;
import com.OrangeHRM.ObjectPackage.WebPage_01_LoginPage;

public class AddEmployeeTest extends ProjectSpecifications {
	
	@BeforeTest
	public void fileName()
	{
		filename="Employees";
	}
	
	
	@Test(dataProvider = "sendData",enabled = true)
	public void login(String firstName, String middleName , String lastName, String EmployeeID)
	{
		
		WebPage_01_LoginPage login = new WebPage_01_LoginPage(driver);
		
		login.userName().userPassword().logInButton().pim().createEmployee(firstName, middleName, lastName, EmployeeID).employeelistMenu().viewEmployeelist().logOut();
		
	}

}
