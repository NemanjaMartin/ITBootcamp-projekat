package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Profile;

public class TestProfile {
	public static final String EDITDETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String EMPLOYEETUPE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[17]/td[2]/select/option[2]";
	public static final String PAYTYPE_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[18]/td[2]/select/option[2]";
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver- selenium\\chromedriver.exe");	
	        driver = new ChromeDriver();
	}
	
    @Test
    public void testProfile() throws InterruptedException {
    	SoftAssert sa = new SoftAssert();
    	Profile.GoToProfile(driver);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath(EDITDETAILS_XPATH)).click();
    	Thread.sleep(1000);
    	driver.findElement(By.name("employee_type")).click();
    	driver.findElement(By.xpath(EMPLOYEETUPE_XPATH)).click();
    	driver.findElement(By.name("pay_type")).click();
    	driver.findElement(By.xpath(PAYTYPE_XPATH)).click();
    	
    
    	
    	driver.findElement(By.xpath(EMPLOYEETUPE_XPATH)).getText();
    	sa.assertEquals(driver.findElement(By.xpath(EMPLOYEETUPE_XPATH)).getText(), "Full time");
    	sa.assertEquals(driver.findElement(By.xpath(PAYTYPE_XPATH)).getText(), "Hourly");
      
    	sa.assertAll();
    }

}
