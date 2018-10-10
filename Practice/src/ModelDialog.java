import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModelDialog {
	
	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub WebDriver driver = new InternetExplorerDriver(); 
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace_Selenium_Java\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://samples.msdn.microsoft.com/workshop/samples/author/dhtml/refs/showModalDialog2.htm"); 
		String parent = driver.getWindowHandle(); 
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		WebElement push_to_create = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[value='Push To Create']"))); 
		push_to_create.click(); 
		waitForWindow(driver); 
		switchToModalDialog(driver, parent); 
		} 
	public static void waitForWindow(WebDriver driver) throws InterruptedException { 
			//wait until number of window handles become 2 or until 6 seconds are completed. 
		int timecount = 1; 
		do 
		{
		driver.getWindowHandles(); 
		Thread.sleep(200); 
		timecount++; 
		if (timecount > 30) 
		{ break; 
		} } 
		while (driver.getWindowHandles().size() != 2); 
		} 

		public static void switchToModalDialog(WebDriver driver, String parent) { 
		//Switch to Modal dialog if (driver.getWindowHandles().size() == 2) 
		{ 
			for (String window : driver.getWindowHandles()) { 
				if (!window.equals(parent)) { 
					driver.switchTo().window(window);
					System.out.println("Modal dialog found"); break; 
		} } } } 
		}