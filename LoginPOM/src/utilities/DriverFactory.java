package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	// This method returns WebDriver object
	
		public static WebDriver open(String browserType)
		{
			if(browserType.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Workspace_Selenium_Java\\Softwares\\IEDriverServer.exe");
				return new InternetExplorerDriver();
			}
			else if (browserType.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Workspace_Selenium_Java\\Softwares\\geckodriver.exe");
				return new FirefoxDriver();
			}
			else
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Workspace_Selenium_Java\\Softwares\\chromedriver.exe");
				return new ChromeDriver();
			}
		}
}