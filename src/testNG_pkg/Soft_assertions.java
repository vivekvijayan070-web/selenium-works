package testNG_pkg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assertions {

	ChromeDriver 	driver;
	@BeforeClass
	public void setup() {
	 driver=new ChromeDriver();
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 driver.manage().window().maximize();
	}
	
	@Test
	public void logoVerification() {
		WebElement logo =driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		boolean res=logo.isDisplayed();
		System.out.println(res);
		
	  SoftAssert obj=new SoftAssert();
	  obj.assertTrue(res);
	  obj.assertAll();
	  
	}
	@Test
		public void verification() {
			String ActualTitle=driver.getTitle();
			System.out.println(ActualTitle);
			
			String expectedTitle="Rediff free unlimited storage";
			SoftAssert obj=new SoftAssert();
			obj.assertEquals(expectedTitle,ActualTitle);
			obj.assertAll();
			System.out.println("sucess");
			
	}
}
