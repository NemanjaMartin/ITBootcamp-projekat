package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {
	
	public static final String SETTING_XPATH = "//*[@id=\"sn_admin\"]/span/i";
	public static final String SETTING_ID = "sn_admin";
	
	
	
	public static void GoToSettings(WebDriver driver) throws InterruptedException {
		
		
		Home.Login(driver);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(SETTING_XPATH)).click();
		
		
	}

}
