package testNG_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils_pkg.UtilExel;



public class Exel_open {
	ChromeDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://keralaproperty.in/member/login/");
	}


	
	@DataProvider(name="loginData")
	public Object[][] getData() throws Exception {
		String path = "C:\\Users\\HP\\Downloads\\New folder\\Book1(AutoRecovered).xlsx";
		String sheet = "login";
		return UtilExel.getTestData(path, sheet);
		
	}
	
	
	
	@Test(dataProvider= "loginData")
	public void loginTest(String uname,String pass) {
		WebElement username= driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		username.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys(pass);
		WebElement login= driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		login.click();
		
		System.out.println("Executed for -- "+uname);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
			   
	}
	@AfterMethod
	public void cut() {
		driver.quit();
	}
}









