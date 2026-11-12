package junit_pkg;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_count {

	ChromeDriver driver;
	@BeforeEach
	public void google()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/?zx=1791869163451");
		driver.manage().window().maximize();
	}
	@Test
	public void linkcount()
	{
	List<WebElement> link=driver.findElements(By.tagName("a"));
	System.out.println("no:of link"+link.size());
	for(WebElement li:link)
	{
		System.out.println("link-----"+li.getAttribute("href"));
		System.out.println("link text "+li.getText());
	}
	}
}
