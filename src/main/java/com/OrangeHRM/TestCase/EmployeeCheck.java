package com.OrangeHRM.TestCase;

import org.testng.annotations.Test;

import com.OrangeHRM.Base.ProjectSpecifications;
import com.OrangeHRM.ObjectPackage.WebPage_01_LoginPage;
import com.OrangeHRM.ObjectPackage.WebPage_04_EmployeesListPage;

public class EmployeeCheck extends ProjectSpecifications{
	
	@Test(enabled = true)
	public void checkEmployees()
	{
		WebPage_01_LoginPage login = new WebPage_01_LoginPage(driver);
		WebPage_04_EmployeesListPage employee = new WebPage_04_EmployeesListPage(driver);
		
		login.userName().userPassword().logInButton().pim();
		employee.employeelistMenu().viewEmployeelist();
	}

}
