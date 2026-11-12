package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_pgm {
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	
	{
		driver=new ChromeDriver() ;
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id=\"ulogin\"]"));
		username.sendKeys("abcd");
		WebElement password=driver.findElement(By.xpath("//input[@id=\"upass\"]"));
		password.sendKeys("osuhv29376");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]"));
		loginButton.click();
	//}
	// @AfterEach
		// public void closeWindow()
		 //{
		// driver.quit();
	
		 }
}
