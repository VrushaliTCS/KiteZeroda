package Base_Utility_ActiTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseActi {
	public WebDriver driver;
public void initialiseBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogesh\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	//maximize
	driver.manage().window().maximize();
	//wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
}
