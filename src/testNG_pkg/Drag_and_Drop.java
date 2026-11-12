package testNG_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Drag_and_Drop {
ChromeDriver driver;
@BeforeClass
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://webdriveruniversity.com/Actions/index.html");
	driver.manage().window().maximize();
}
@Test
public void dreag() throws Exception {
	Thread.sleep(3000);
	WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
	WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop);
	act.perform();
	
	
	WebElement over=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
	over.click();
	WebElement link=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
	link.click();
	driver.switchTo().alert().accept();
	
	WebElement clickandHold_btn=driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
	act.clickAndHold(clickandHold_btn).perform();
	Thread.sleep(2000);	
	
	WebElement double_btn=driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
	act.doubleClick(double_btn).perform();
	
}
}
