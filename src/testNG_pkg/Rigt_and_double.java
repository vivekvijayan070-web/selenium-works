package testNG_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Rigt_and_double {
	ChromeDriver driver;
	@BeforeClass
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	}
@Test
public void guru() throws Exception {
	Thread.sleep(3000);
	WebElement doublebtn=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
	Actions act=new Actions(driver);
	act.doubleClick(doublebtn);
	Thread.sleep(2000);
	WebElement rclick=driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
	act.contextClick(rclick);
	act.perform();
	
}
}
