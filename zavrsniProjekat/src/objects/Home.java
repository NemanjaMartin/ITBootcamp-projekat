package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	public static final String URL =  "https://www.humanity.com/";
	
	public static void Login (WebDriver driver) throws InterruptedException  {
		Thread.sleep(5000);
			
		
		driver.navigate().to(URL);
		
			Thread.sleep(2000);
	
		driver.findElement(By.xpath("//*[@id=\"tcp-modal\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[2]/p")).click();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("adresa@email.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("sifra1234");
		driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
