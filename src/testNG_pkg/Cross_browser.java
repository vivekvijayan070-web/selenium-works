package testNG_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browser {
	WebDriver driver;
	@Parameters("browser")
	
	@BeforeTest
	public void setup(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		System.out.println("ChromeDriver");
	}
	else {
		driver=new EdgeDriver();
				System.out.println("EdgeBrowser");
	}
}
	@Test
	public void methd1() throws Exception {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
}
