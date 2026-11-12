package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_pgm {
	ChromeDriver driver;
	@BeforeEach
	public void open()
	
	{
		driver=new ChromeDriver() ;
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
}
	@Test
	public void home() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
				//search.sendKeys("mobiles");
				search.sendKeys("mobile",Keys.ENTER);
				WebElement Electronics=driver.findElement(By.xpath("//a[contains (text(),'Electronics')]"));
				Electronics.click();
				WebElement cart=driver.findElement(By.xpath("//span[contains (text(),'  Cart')]"));
				cart.click();
}
}