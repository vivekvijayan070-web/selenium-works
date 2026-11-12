package selenium_pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_program {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();// suppose we need to opened browser Edgeriver
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();// Retrieve the title of the web application
		System.out.println("Title of the web application is :" + actualtitle);

		String exeptedtitle = "Google";
		if (actualtitle.equals(exeptedtitle)) {
			System.out.println("the title's matches");
		} else {
			System.out.println("Title is not matched");
		}
	}
}
