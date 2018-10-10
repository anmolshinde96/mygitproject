

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ToolTipTest {

	@Test
	public void toolTipMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Workspace_Selenium_Java\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		// Explicit wait to wait for the frame. 
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
		WebElement ele = driver.findElement(By.id("age"));
		// Using actions class to do mouse hover
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		WebElement toolTipElement = driver.findElement(By.xpath("//*[@id='ui-id-118']/div"));
		// Get the Tool Tip Text
		String toolTipTxt = toolTipElement.getText();
                // Using assert to verify the expected and actual value
		Assert.assertEquals("We ask for your age only for statistical purposes.", toolTipTxt);
	}
}