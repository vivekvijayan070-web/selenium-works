package junit_pkg;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice_pgm {

	ChromeDriver driver;
	@BeforeEach
	public void sugu()
	{
		driver =new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");	
	}

	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("abc");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("pass7254");
		WebElement loginbutton = driver.findElement(By.id("submit"));
		loginbutton.click();
	}	
	}


