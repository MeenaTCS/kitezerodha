package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public WebDriver driver;
public void initilizeBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	//maximize
	driver.manage().window().maximize();
	
	//imlpicitly wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
}
