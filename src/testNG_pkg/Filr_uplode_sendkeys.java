package testNG_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Filr_uplode_sendkeys {
	
	ChromeDriver driver;
	@BeforeClass
	public void broswersetup() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();

}
	@Test
	public void File_meth() throws Exception {
		Thread.sleep(2000);
		WebElement file_button=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		file_button.sendKeys("C:\\Users\\HP\\OneDrive\\Pictures\\pintrest.jpg\\");
	}
}