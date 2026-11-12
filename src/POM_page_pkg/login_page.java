package POM_page_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
WebDriver driver;
//locating web elements using apage actorry

@FindBy(xpath="//*[@id=\"ulogin\"]")WebElement username;
@FindBy(id="upass")WebElement password;
@FindBy(xpath="//*[@id=\"sub_logbtn\"]")WebElement loginbutton;

//Constructor
public login_page(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);


}
//method
public void setvalues() {
	username.sendKeys("vivek vijayan");
	password.sendKeys("kuttan@123");
	
	loginbutton.click();
}
public String titlemeth() {
	String title=driver.getTitle();
	return title;
}
	
}
	

