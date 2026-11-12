package junit_pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Data_dronpgm {
ChromeDriver driver;
@BeforeMethod
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/member/login/");
	driver.manage().window().maximize();
}
}
