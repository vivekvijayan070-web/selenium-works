package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo_verification {

	ChromeDriver driver;
	@BeforeEach
	public void setup()
	
	{
		driver=new ChromeDriver() ;
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		WebElement logo=driver.findElement(By.xpath("//img[@title='Rediffmail']"));
		boolean result=logo.isDisplayed();
		if(result==true) {
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("logo not displayed");
		}
		WebElement genter=driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		boolean button=genter.isEnabled();
		genter.click();
		System.out.println("genter buttonis displayed :"+button);
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		boolean box=checkbox.isSelected();
		if(box==true) {
			System.out.println("check box is displayed");
		}
		else {
			System.out.println("check box not displayed");
			checkbox.click();
		}
}
}























//img[@title='Rediffmail']
//label[contains(text(),'Gender')],
//input[@type="radio"]
//input[@type="checkbox"]