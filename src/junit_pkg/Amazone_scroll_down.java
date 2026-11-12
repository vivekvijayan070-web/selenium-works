package junit_pkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazone_scroll_down {
	ChromeDriver driver;

	@BeforeEach
	public void open()

	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();

	}

	@Test
	public void scrol_down() throws Exception {
		//Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,1000)");
	//	Thread.sleep(2000);
		// screen_shot
		File ssss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ssss, new File("C:\\Users\\HP\\OneDrive\\Desktop\\Selenium Works\\screenshot\\ide.png"));
		
		JavascriptExecutor jb = (JavascriptExecutor) driver;
		jb.executeScript("scrollBy(0,-2000)");
		File b = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(b, new File("C:\\Users\\HP\\OneDrive\\Desktop\\Selenium Works\\screenshot\\back.png"));

	}

}
