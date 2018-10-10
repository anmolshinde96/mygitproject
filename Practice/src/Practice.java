import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	public void web() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Workspace_Selenium_Java\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("http://samples.msdn.microsoft.com/workshop/samples/author/dhtml/refs/showModalDialog2.htm");

}
	
}
