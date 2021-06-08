package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import resources.Constants;

public class TestAboutUs {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver- selenium\\chromedriver.exe");	
	    driver = new ChromeDriver();
	        
	}
	@Test(priority = 1)
	public void AboutUs() {
		driver.navigate().to(Home.URL);
		
	    
		driver.findElement(By.xpath("//*[@id=\"tcp-modal\"]/div/div/div[1]/button")).click();
		
		driver.findElement(By.xpath(Constants.ABOUT_US_BUTTON)).click();
		driver.findElement(By.xpath(Constants.GO_TO_ABOUT_US)).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File("C:/Users/Stefan/Desktop/screenshot/tets.png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		driver.navigate().back();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.navigate().refresh();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
			
		
		
	}

}
