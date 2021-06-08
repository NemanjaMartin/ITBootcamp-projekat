package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Profile {
	
	public static final String URL =  "https://kompanija251.humanity.com/app/dashboard/";
	
	
	
	public static void GoToProfile (WebDriver driver) throws InterruptedException {
		
		Home.Login(driver);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"wrap_us_menu\"]/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"userm\"]/div/a[1]")).click();
		
	
	}

}



