package testNG_pkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Date_picker {

	ChromeDriver driver;

	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	}

	@Test
	public void datepicker() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement callender = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		callender.click();

		while (true) {
			String box = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			System.out.println("box  =" + box);

			if (box.equalsIgnoreCase("December 2026")) {
				break;
			} else {
				WebElement nextarrow = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
				nextarrow.click();
			}
		}
		List<WebElement> date = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for (WebElement d : date) {
			String datetext = d.getText();
			if (datetext.equals("10"))
				;
			{
				d.click();
				System.out.println("date selected");
				break;
				
			}
		}
	}
}
