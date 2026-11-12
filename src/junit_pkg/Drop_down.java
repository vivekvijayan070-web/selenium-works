package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	ChromeDriver driver;
	Select obj;
	
	@BeforeEach
	public void setup()
	
	{
		driver=new ChromeDriver() ;
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void drop_down() 
	{
		
	WebElement day =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
	obj=new Select(day);//creating object for select class
	obj.selectByIndex(2);//locating using index position
	//WebElement month =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
	//obj=new Select(month);//creating object for select class
	//obj.selectByIndex(2);//locating using index position
	
	WebElement year =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
	obj=new Select(year);//creating object for select class
	obj.selectByVisibleText("2002");//
	
	WebElement month1 =driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
	obj=new Select(month1);//creating object for select class
	obj.selectByValue("05");//
	


	

	
	}
}
