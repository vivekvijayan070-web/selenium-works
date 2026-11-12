package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pgm {

	
		ChromeDriver driver;

		@BeforeEach
		public void open()

		{
			driver = new ChromeDriver();
			driver.get("file:///C:/Users/HP/OneDrive/Desktop/java%20works/display.html");
			driver.manage().window().maximize();
		}

		@Test
		public void alert() throws InterruptedException {
			WebElement display = driver.findElement(By.xpath("/html/body/input[1]"));
			display.click();

			Alert alrt = driver.switchTo().alert();
			String txt = alrt.getText();
			System.out.println("alert message :" + txt);

			Thread.sleep(2000);
			alrt.accept();

			WebElement first_name = driver.findElement(By.xpath("/html/body/input[2]"));
			first_name.sendKeys("kuttan");
			WebElement last_name = driver.findElement(By.xpath("/html/body/input[3]"));
			last_name.sendKeys("plinku");
			WebElement submit = driver.findElement(By.xpath("/html/body/input[4]"));
			submit.click();

		}
	}

