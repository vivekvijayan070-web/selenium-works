package testNG_pkg;

import java.io.File;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Window_handler {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
	}

	@Test
	public void homepg() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentwindow = driver.getWindowHandle();
		WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchbar.sendKeys("Mobiles", Keys.ENTER);
		WebElement phnlink = driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a"));
		phnlink.click();

		Set<String> tabdetails = driver.getWindowHandles();
		for (String handle : tabdetails) {
			if (!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(s,
						new File("C:\\Users\\HP\\OneDrive\\Desktop\\Selenium Works\\screenshot\\amazone.png"));
			}

		}

	}

	@AfterTest
	public void quit() {
		driver.close();
	}
}
