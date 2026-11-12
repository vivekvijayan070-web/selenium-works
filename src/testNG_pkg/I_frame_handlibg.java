package testNG_pkg;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class I_frame_handlibg {

	ChromeDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}

	@Test
	public void logintest() {
		WebElement user = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		user.sendKeys("ebin.luminar@gmail.com");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys("123456");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		login.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains(" https://keralaproperty.in/member/myhome/"));
	}

	@Test
	public void addpropertymeth() {
		WebElement add_btn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		add_btn.click();

		WebElement frametag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		driver.switchTo().frame(frametag);

		WebElement summry = driver.findElement(By.xpath("/html/body"));
		summry.click();
		summry.sendKeys("hi hello ");
		driver.switchTo().defaultContent();
	}

}
