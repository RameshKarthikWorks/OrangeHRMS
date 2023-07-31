package com.OrangeHRM.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DataDriven;

public class ProjectSpecifications {

	public WebDriver driver;
	public String filename;

	@BeforeMethod
	public void preConditions() throws IOException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		FileInputStream file = new FileInputStream(
				"C:\\Users\\ADMIN\\eclipse-workspace\\com.OrangeHRM\\Config.properties");

		Properties prop = new Properties();

		prop.load(file);

		driver.get(prop.getProperty("url"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	}
	
	@DataProvider(name="sendData")
	public String[][] excelfileRead() throws IOException
	{
		return DataDriven.readExcel(filename);
		
	}

	@AfterMethod
	public void postConditions() {
		
		driver.quit();

	}
}
