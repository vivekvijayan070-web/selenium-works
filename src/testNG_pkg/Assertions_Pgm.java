package testNG_pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions_Pgm {
ChromeDriver 	driver;
@BeforeClass
public void setup() {
 driver=new ChromeDriver();
 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
 driver.manage().window().maximize();
 
}
@Test(priority = 1)
public void verification() {
	String ActualTitle=driver.getTitle();
	System.out.println(ActualTitle);
	
	String expectedTitle="Rediff free unlimited storage";
			Assert.assertEquals(expectedTitle, ActualTitle);
			System.out.println("sucess");
}
	
@Test(priority = 2)
public void URLverification() {
	String actualurl=driver.getCurrentUrl();
	//System.out.println(actualurl);
	
String expectedURL="https://register.rediff.com/register/register.php?FormName=user_details";
Assert.assertEquals(expectedURL,actualurl);
System.out.println("URL Verificatio complected");
}
}
