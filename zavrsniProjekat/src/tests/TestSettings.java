package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.Home;
import objects.Settings;
import resources.Constants;

public class TestSettings {

	public static final String NOTIFICATION_EMAIL = "//*[@id=\"pref_pref_email\"]";
	public static final String NOTIFICATION_SMS = "//*[@id=\"pref_pref_sms\"]";
	public static final String NOTIFICATION_MOBILE_PUSH = "//*[@id=\"pref_pref_mobile_push\"]";

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver- selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void testChangeLanguage() throws InterruptedException {
		Settings.GoToSettings(driver);
		Thread.sleep(2000);
		driver.findElement(By.name("language")).click();
		driver.findElement(By.xpath("//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select/option[37]"))
				.click();
		driver.findElement(By.id("_save_settings_button")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[1]/label/a")).click();
		
		

	}

	@Test(priority = 2)
	public void DisableNotification() throws InterruptedException {

		SoftAssert sa = new SoftAssert();

		Thread.sleep(5000);

		driver.findElement(By.xpath(Constants.NOTIFICATION_EMAIL)).isSelected();

		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.NOTIFICATION_SMS)).isSelected();

		Thread.sleep(2000);
		driver.findElement(By.xpath(Constants.NOTIFICATION_MOBILE_PUSH)).isSelected();
		
		if(driver.findElement(By.xpath(Constants.NOTIFICATION_EMAIL)).isSelected()) {
			driver.findElement(By.xpath(Constants.NOTIFICATION_EMAIL)).click();
			System.out.println("passed");
		}
		
		if(driver.findElement(By.xpath(Constants.NOTIFICATION_SMS)).isSelected()) {
			driver.findElement(By.xpath(Constants.NOTIFICATION_SMS)).click();
			System.out.println("passed");
		}


		if(driver.findElement(By.xpath(Constants.NOTIFICATION_MOBILE_PUSH)).isSelected()) {
			driver.findElement(By.xpath(Constants.NOTIFICATION_MOBILE_PUSH)).click();
			System.out.println("passed");
		}	
		

	}

}
