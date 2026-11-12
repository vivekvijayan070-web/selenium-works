package POM_test_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_base_pkg.base_class;
import POM_page_pkg.login_page;

public class login_test_pkg extends base_class{

	
login_page obj;
@BeforeMethod
public void objmeth() {
	obj=new login_page(driver);
}
	
@Test
public void loginTestMethord() {
	obj.setvalues();
	obj.titlemeth();
	System.out.println("title"+obj.titlemeth());
}
@Test 
public void titleverification() {
	System.out.println("title"+obj.titlemeth());
	}
}

