package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains {
ChromeDriver driver;
@BeforeEach
public void rediff()
{
driver =new ChromeDriver();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
driver.manage().window().maximize();
}
@Test
public void email() throws InterruptedException
{
	WebElement email=driver.findElement(By.xpath("//input[contains(@id,'login')]"));
	email.sendKeys("email@123");
	Thread.sleep(3000);
	WebElement name=driver.findElement(By.xpath("//input[contains(@name,'name')and@placeholder=\"Enter your full name\"]"));
	name.sendKeys("vivek",Keys.ENTER);
	
	
}
}

