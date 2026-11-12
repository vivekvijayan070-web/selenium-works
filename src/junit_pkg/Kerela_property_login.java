package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kerela_property_login {
	ChromeDriver driver;

	@BeforeEach
	public void Setup() {
		System.out.println("beforeEach");
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();// to minimize the window
	}

	@Test
	public void titleverification() {
		String actualtitle = driver.getTitle();
		System.out.println("Title of the webpage :" + actualtitle);
	}

	@Test
	public void TestVerification() {
		String sourcecode = driver.getPageSource();
		if (sourcecode.contains("User Login")) {
			System.out.println("text is present");

		} else {
			System.out.println("text not present.");
		}
	}

	@Test
	public void login() {
		WebElement username = driver.findElement(By.id("ulogin"));
		username.sendKeys("abc");
		WebElement password = driver.findElement(By.id("upass"));
		password.sendKeys("pass7254");
		WebElement loginbutton = driver.findElement(By.id("sub_logbtn"));
		loginbutton.click();
	}

	// @AfterEach
	// public void closeWindow()
	// {
	// driver.quit();

	// }
}
