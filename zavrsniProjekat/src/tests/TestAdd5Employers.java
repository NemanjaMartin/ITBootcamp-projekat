package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Home;
import resources.Constants;

public class TestAdd5Employers {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver- selenium\\chromedriver.exe");	
	        driver = new ChromeDriver();
	}
	
	@Test
	public void testAdd5Employers() throws InterruptedException {
		File f = new File("Zaposleni.xlsx");
		try {
			
		
		
		InputStream in = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		Sheet sheet = wb.getSheetAt(0);
		
		 SoftAssert sa = new SoftAssert();
		 Home.Login(driver);
		Thread.sleep(2000);	
			for(int i = 0; i < 4; i++) {
				Row row = sheet.getRow(i);
				Cell c0 = row.getCell(0);
				Cell c1 = row.getCell(1);
				Cell c2 = row.getCell(2);
				
				
				String zaposleniIme = c0.toString();
				String zaposleniPrezime = c1.toString();
				String zaposleniPozicija= c2.toString();
				
		    driver.navigate().to("https://kompanija251.humanity.com/app/schedule/employee/week/overview/overview/4%2c5%2c2021/");
		    	
		    	
		    	Thread.sleep(2000);
		    	//*[@id="e_empty"]/button
		    	driver.findElement(By.xpath(Constants.ADD_EMPLOYEE_BUTTON)).click();
		    	driver.findElement(By.id("fname_2")).click();
		    	driver.findElement(By.id("fname_2")).sendKeys(zaposleniIme);
		    	driver.findElement(By.id("lname_2")).click();
		    	driver.findElement(By.id("lname_2")).sendKeys(zaposleniPrezime);
		    	Thread.sleep(5000);
		        driver.findElement(By.xpath(Constants.EMPLOYEE_POSITION_FIELD)).click();
		        //"//*[@id=\"positions_2-selectized\"]"
		        driver.findElement(By.xpath(Constants.EMPLOYEE_POSITION_FIELD)).sendKeys(zaposleniPozicija);
		    	driver.findElement(By.xpath(Constants.EMPLOYEE_POSITION_FIELD)).sendKeys(Keys.ENTER);
		    	driver.findElement(By.id(Constants.ADD_EMPLOYEE_ID)).click();
		    	Thread.sleep(5000);
		    	
		    	sa.assertTrue(driver.getPageSource().contains(zaposleniIme));
		    	
		    	
		    	
			  } 
			
			sa.assertAll();
			wb.close();
			
			
		}catch ( IOException e) {
	    			
	    			e.printStackTrace();
	    		}
		    	
		      
			 	
	
	}	
}
