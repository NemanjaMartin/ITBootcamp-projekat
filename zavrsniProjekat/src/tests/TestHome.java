package tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import resources.Constants;

public class TestHome {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver- selenium\\chromedriver.exe");	
	    driver = new ChromeDriver();
	        
	}
	
	
	@Test(priority = 1)
	public void LoginTest() throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		Home.Login(driver);
	
		
		String currnetUrl = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		String expectedUrl = "https://kompanija251.humanity.com/app/dashboard/";
		
		Assert.assertEquals(currnetUrl, expectedUrl );
		
		
		
	}
	
    

}
