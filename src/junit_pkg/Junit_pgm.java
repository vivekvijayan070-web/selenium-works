package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_pgm {
	ChromeDriver driver;
	private Object expectedtitle;

	@BeforeEach
	public void browserSetup() {
		System.out.println("before each");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void titleverification() {
		System.out.println("test 1");
		String actualtitle = driver.getTitle();
		String expectedtitle = "google";
		if (expectedtitle.equals(actualtitle)) {
			System.out.println("matching");
		} else {
			System.out.println("Miss matching");
		}
	}

	@Test
	public void method2() {
		System.out.println("method2");
		System.out.println("test2");
	}

	@AfterEach
	public void clossingmethod() {
		System.out.println("after each");
		// driver.close();//to close the browser single tab
	driver.quit();//close the current tab and quit
	}
}
