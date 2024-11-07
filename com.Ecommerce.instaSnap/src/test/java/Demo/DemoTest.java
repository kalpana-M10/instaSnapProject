package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	@Test
	public void verify()
	{
		
	//configure the browser
		WebDriverManager.chromedriver().setup();
		//Launch the browser
	WebDriver driver=new ChromeDriver();
	//navigate to the application
	driver.get("https://www.google.com/");
	}

}
