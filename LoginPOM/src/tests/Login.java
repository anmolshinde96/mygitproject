package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.DashBoardPage;
import pages.LoginPage;

public class Login {
	
	String browserType = "chrome";
	
	@Test
	public void loginTestPOM()
	
	{
	
		// 1. Initialize driver
		WebDriver driver = utilities.DriverFactory.open(browserType);
		driver.manage().window().maximize();
		driver.get("http://www.sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 2. Enter login Information(Login Page)
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("tim@testemail.com", "trpass");
		
		// 3. Get confirmation
		DashBoardPage dashBoard= new DashBoardPage(driver);
		String conf = dashBoard.confirmationMessage();
		System.out.println(conf);
		Assert.assertTrue(conf.contains("Logged"));
		
		// 4. Close the driver
		//driver.quit();
	
}
}