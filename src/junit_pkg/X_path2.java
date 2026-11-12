package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path2 {
	ChromeDriver driver;
	@BeforeEach
	public void practice()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	@Test
	public void open()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		username.sendKeys("abcd");
		WebElement password=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("osuhv29376");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"submit\"]"));
		loginButton.click();
	
	
	
	}

}
