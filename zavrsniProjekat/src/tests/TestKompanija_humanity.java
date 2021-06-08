package tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import objects.Kompanija;

public class TestKompanija_humanity {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver- selenium\\chromedriver.exe");	
	        driver = new ChromeDriver();
	}
	
	
	@Test(priority = 1)
	public void testDashBoard() throws InterruptedException {
		Kompanija.DashBoard(driver);
		
	    String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://kompanija251.humanity.com/app/dashboard/";
		
		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}
	
	@Test(priority = 2)
	public void ShiftPlanning() {
		Kompanija.ShiftPlaning(driver);
		
		 String CurrnetTitle = driver.getTitle();
		 String expectedTitle = "ShiftPlanning - Humanity";
		 
		 Assert.assertEquals(CurrnetTitle, expectedTitle);
	}
	
	@Test(priority = 3)
	public void TImeClock() {
		Kompanija.TimeClock(driver);
		String CurrnetUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://kompanija251.humanity.com/app/timeclock/";
		
		Assert.assertEquals(CurrnetUrl, expectedUrl);
	}
	
	@Test(priority = 4)
	public void testLeave() {
		Kompanija.Leave(driver);
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://kompanija251.humanity.com/app/requests/vacation/";
		Assert.assertEquals(CurrnetUrl,expectedUrl);
	}
	
	
	@Test(priority = 5)
	public void testTraining() {
		Kompanija.Training(driver);
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://kompanija251.humanity.com/app/training/";
		
		Assert.assertEquals(CurrnetUrl,expectedUrl);
	}
	
	@Test(priority = 6)
	public void testStaff() {
		Kompanija.Staff(driver);
        
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl = "https://kompanija251.humanity.com/app/staff/list/load/true/";
		
		Assert.assertEquals(CurrnetUrl,expectedUrl);
	}
	
	@Test(priority = 11)
	public void testAvailability() {
		Kompanija.Availability(driver);
		
		//driver.navigate().refresh();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String CurrnetTitle = driver.getTitle();
		String expectedTitle  = "Humanity";
		
		Assert.assertEquals(CurrnetTitle,expectedTitle);
	}
	
	@Test(priority = 7)
	public void testPayroll() {
		Kompanija.Payroll(driver);
		String CurrnetUrl = driver.getCurrentUrl();
		String expectedUrl  = "https://kompanija251.humanity.com/app/payroll/scheduled-hours/";
		
		Assert.assertEquals(CurrnetUrl,expectedUrl);
	}
	@Test(priority = 8)
    public void testReports() {
         
    	
    	Kompanija.Reports(driver);
    	String CurrnetUrl = driver.getCurrentUrl();
    	String expectedUrl  = "https://kompanija251.humanity.com/app/reports/dashboard/";
    	
    	Assert.assertEquals(CurrnetUrl,expectedUrl);
    }
	
	@Test(priority = 9)
	public void testAddEmploye() throws InterruptedException {
		
		Kompanija.AddEmployees(driver);
		    
		Thread.sleep(5000);
    	//driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).click();
    	
    	
    	//driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).sendKeys("Manager");
    	//driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).sendKeys(Keys.ENTER);
    	
    	driver.navigate().to("https://kompanija251.humanity.com/app/staff/detail/6359484/");
    	
    	
    	Assert.assertTrue(driver.getPageSource().contains("Pera"));
    	
    	
     
	}
	
	@Test(priority = 10)
	public void testEmployeNameChange() throws InterruptedException {
		//driver.findElement(By.xpath("https://kompanija251.humanity.com/app/staff/list/load/true/")).click();
		Kompanija.EmployeChangeName(driver, "Mita");
		driver.findElement(By.name("update")).click();	
		
		Assert.assertTrue(driver.getPageSource().contains("Mita"));
		
	}
	
	
    	
	
	
	
}
