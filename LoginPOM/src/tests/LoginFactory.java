package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPageFactory;

public class LoginFactory {
	
	public static void loginTestPageFactory() {
		
		// 1. Initialize the driver
		WebDriver driver = utilities.DriverFactory.open("chrome");
		driver.manage().window().maximize();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 2. Enter login
		LoginPageFactory loginPage = new LoginPageFactory(driver);
		loginPage.login("tim@testemail.com", "trpass");
	}
	
	
	}
