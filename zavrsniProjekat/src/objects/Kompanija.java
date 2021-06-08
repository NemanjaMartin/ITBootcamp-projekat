package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import resources.Constants;

public class Kompanija {
	
	public static final String URL =  "https://kompanija251.humanity.com/app/dashboard/";
	
	
	
	public static void DashBoard(WebDriver driver) throws InterruptedException {
		
		Home.Login(driver);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Constants.DASHBOARD_XPATH)).click();
		
	}
	
	public static void ShiftPlaning(WebDriver driver) {
		
		driver.navigate().to(URL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Constants.SHIFTPLANING_XPATH)).click();
	
	}  
	
	public static void TimeClock(WebDriver driver) {
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Constants.TIMECLOCK)).click();
		
	}
	
	public static void Leave(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Constants.LEAVE_XPATH)).click();
	}
    public static void Training(WebDriver driver) {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Constants.TRAINING_XPATH)).click();
	}
    public static void Staff(WebDriver driver) {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(Constants.STAFF_XPATH)).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
    
    public static void Availability(WebDriver driver) {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath(Constants.AVAILABILITY_XPATH)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
    
    public static void Payroll(WebDriver driver) {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	driver.findElement(By.xpath(Constants.PAYROLL_XPATH)).click();
    }
    
    public static void Reports(WebDriver driver) {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(By.xpath(Constants.REPORTS_XPATH)).click();
    }
    
    public static void AddEmployees(WebDriver driver) throws InterruptedException {
    	//Home.Login(driver);
    	driver.navigate().to("https://kompanija251.humanity.com/app/schedule/employee/week/overview/overview/4%2c5%2c2021/");
  
			Thread.sleep(2000);

    	driver.findElement(By.xpath("//*[@id=\"e_empty\"]/button")).click();
    	driver.findElement(By.id("fname_2")).click();
    	driver.findElement(By.id("fname_2")).sendKeys("Pera");
    	driver.findElement(By.id("lname_2")).click();
    	driver.findElement(By.id("lname_2")).sendKeys("Peric");
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).click();
    	
    	driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).sendKeys("Manager");
    	driver.findElement(By.xpath("//*[@id=\"positions_2-selectized\"]")).sendKeys(Keys.ENTER);
    	driver.findElement(By.id("add_employee_btn")).click();
  
    }
    public static void EmployeChangeName(WebDriver driver, String name) throws InterruptedException {
    	
    	//Home.Login(driver);
    	
		driver.navigate().to("https://kompanija251.humanity.com/app/staff/detail/6360421/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.partialLinkText("Edit Deta")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("first_name")).click();
		driver.findElement(By.id("first_name")).clear();
		
		driver.findElement(By.id("first_name")).sendKeys(name);
		
    }
    
    
    
    
     
    
 
}








