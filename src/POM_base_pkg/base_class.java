package POM_base_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import POM_page_pkg.login_page;

public class base_class {
	
	public static WebDriver driver;
		
		login_page obj;
		@BeforeTest
		public void setup() {
			driver=new ChromeDriver();
			driver.get("https://keralaproperty.in/member/login/");
			driver.manage().window().maximize();
			
		}

}
