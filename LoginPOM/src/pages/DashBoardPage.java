package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
	
	WebDriver driver;
	
	public String confirmationMessage() {
		return driver.findElement(By.id("conf_message")).getText();
	}
	
	public void changePassword() {
		driver.findElement(By.linkText("Change password")).click();
		
	}
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

}
