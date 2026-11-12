package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_pgm {
ChromeDriver driver;
	@BeforeEach
	public void demo() {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	}
	@Test
	public void setup() throws InterruptedException {
		WebElement message=driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
	message.click();
	
	
	Alert alrt1 = driver.switchTo().alert();
	String text=alrt1.getText();
	System.out.println(" text value :  "+text);
	Thread.sleep(2000);
	alrt1.accept();
	
	WebElement message2 =driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
	message2.click();
	
	Alert alrt2 = driver.switchTo().alert();
	String txt=alrt2.getText();
	System.out.println(" text value :  "+txt);
   Thread.sleep(2000);
   alrt2.dismiss();
   
   WebElement message3 =driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
	message3.click();
	Alert aler3=driver.switchTo().alert();
	String texxt=aler3.getText();
	System.out.println("text value :"+texxt);
	aler3.sendKeys("vivekvijayan");
	Thread.sleep(3000);
	aler3.accept();

	
}
}